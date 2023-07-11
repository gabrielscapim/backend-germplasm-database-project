package germplasm.database.api.service;

import germplasm.database.api.dto.DataDetailingGermplasmDTO;
import germplasm.database.api.model.Germplasm;
import germplasm.database.api.repository.GermplasmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GermplasmService {

    @Autowired
    GermplasmRepository germplasmRepository;

    public Iterable<DataDetailingGermplasmDTO> getAllGermplasms() {
        var germplasmsFromDatabase = germplasmRepository.findAll();
        ArrayList<DataDetailingGermplasmDTO> allGermplasms = new ArrayList<>();

        germplasmsFromDatabase.stream().forEach(germplasm -> allGermplasms.add(new DataDetailingGermplasmDTO(germplasm)));

        return allGermplasms;
    }
}
