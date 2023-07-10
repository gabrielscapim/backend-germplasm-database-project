package germplasm.database.api.controller;

import germplasm.database.api.repository.GermplasmRepository;
import germplasm.database.api.service.GermplasmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/germplasm")
public class GermplasmController {

    @Autowired
    private GermplasmRepository germplasmRepository;

    @Autowired
    private GermplasmService germplasmService;

    @GetMapping
    public ResponseEntity getAllGermplasms() {
        return ResponseEntity.ok(germplasmService.getAllGermplasms());
    }
}
