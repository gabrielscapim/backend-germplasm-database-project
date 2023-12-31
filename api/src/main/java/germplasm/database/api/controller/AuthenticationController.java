package germplasm.database.api.controller;

import germplasm.database.api.dto.AuthenticationDataDTO;
import germplasm.database.api.dto.TokenDTO;
import germplasm.database.api.model.User;
import germplasm.database.api.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid AuthenticationDataDTO authenticationDataDTO) {
        var AuthenticationToken = new UsernamePasswordAuthenticationToken(authenticationDataDTO.login(), authenticationDataDTO.password());
        var authentication = authenticationManager.authenticate(AuthenticationToken);

        var token = tokenService.generateToken((User) authentication.getPrincipal());

        return ResponseEntity.ok(new TokenDTO(token));
    }

}
