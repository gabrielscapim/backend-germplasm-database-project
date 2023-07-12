package germplasm.database.api.controller;

import germplasm.database.api.dto.AuthenticationDataDTO;
import germplasm.database.api.model.User;
import germplasm.database.api.service.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody @Valid AuthenticationDataDTO authenticationDataDTO) {
        var AuthenticationToken = new UsernamePasswordAuthenticationToken(authenticationDataDTO.login(), authenticationDataDTO.senha());
        var authentication = authenticationManager.authenticate(AuthenticationToken);

        return ResponseEntity.ok(tokenService.generateToken((User) authentication.getPrincipal()));
    }

}
