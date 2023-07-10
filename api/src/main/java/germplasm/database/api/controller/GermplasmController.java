package germplasm.database.api.controller;

import germplasm.database.api.repository.GermplasmRepository;
import germplasm.database.api.service.GermplasmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/germplasm")
public class GermplasmController {

    @Autowired
    private GermplasmService germplasmService;

    @GetMapping
    public ResponseEntity getAllGermplasms(@PageableDefault(size = 20, sort={ "id" }) Pageable pageable) {
        return ResponseEntity.ok(germplasmService.getAllGermplasms(pageable));
    }

}
