package germplasm.database.api.service;

import germplasm.database.api.dto.DataDetailingGermplasmDTO;
import germplasm.database.api.repository.GermplasmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class GermplasmService {

    @Autowired
    GermplasmRepository germplasmRepository;

    public Page<DataDetailingGermplasmDTO> getAllGermplasms(Pageable pageable) {
        var germplasmPage = germplasmRepository.findAll(pageable).map(DataDetailingGermplasmDTO::new);

        return germplasmPage;
    }
}
