package germplasm.database.api.controller;

import germplasm.database.api.dto.DataAddGermplasmDTO;
import germplasm.database.api.model.Germplasm;
import germplasm.database.api.repository.GermplasmRepository;
import germplasm.database.api.service.GermplasmService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/germplasm")
public class GermplasmController {

    @Autowired
    private GermplasmService germplasmService;

    @GetMapping
    public ResponseEntity getAllGermplasms() {
        return ResponseEntity.ok(germplasmService.getAllGermplasms());
    }

    @PostMapping
    public ResponseEntity addGermplasm(
            @RequestBody @Valid DataAddGermplasmDTO dataAddGermplasmDTO,
            UriComponentsBuilder uriComponentsBuilder
            ) {
        var germplasm = germplasmService.addGermplasm(dataAddGermplasmDTO);

        var uri = uriComponentsBuilder.path("/germplasm/{id}").buildAndExpand(germplasm.getId()).toUri();

        return ResponseEntity.created(uri).body(germplasm);
    }

    @GetMapping("/{id}")
    public ResponseEntity getGermplasmById(@PathVariable Integer id) {
        var germplasm = germplasmService.getGermplasmById(id);

        return ResponseEntity.ok(germplasm);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteGermplasmById(@PathVariable Integer id) {
        var returnFromService = germplasmService.deleteGermplasmById(id);

        if (returnFromService != null) {
            return ResponseEntity.badRequest().body(returnFromService);
        }

        return ResponseEntity.status(204).build();
    }
}
