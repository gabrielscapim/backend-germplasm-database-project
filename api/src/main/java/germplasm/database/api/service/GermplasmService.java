package germplasm.database.api.service;

import germplasm.database.api.dto.DataDetailingGermplasmDTO;
import germplasm.database.api.model.Germplasm;
import germplasm.database.api.repository.GermplasmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GermplasmService {

    @Autowired
    GermplasmRepository germplasmRepository;

    public Iterable<DataDetailingGermplasmDTO> getAllGermplasms() {
        Iterable<Germplasm> germplasms = germplasmRepository.findAll();
        List<DataDetailingGermplasmDTO> dtos = new ArrayList<>();

        germplasms.forEach(germplasm -> dtos.add(new DataDetailingGermplasmDTO(germplasm)));

        return dtos;
    }
}
