package germplasm.database.api.service;

import germplasm.database.api.dto.DataAddGermplasmDTO;
import germplasm.database.api.dto.DataDetailingGermplasmDTO;
import germplasm.database.api.model.Germplasm;
import germplasm.database.api.repository.GermplasmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

    public Germplasm addGermplasm(DataAddGermplasmDTO dataAddGermplasmDTO) {
        var germplasm = new Germplasm(dataAddGermplasmDTO);

        germplasmRepository.save(germplasm);

        return germplasm;
    }

    public DataDetailingGermplasmDTO getGermplasmById(Integer id) {
        var germplasmFromDataBase = germplasmRepository.getReferenceById(id);

        return new DataDetailingGermplasmDTO(germplasmFromDataBase);
    }

    public Map<String, String> deleteGermplasmById(Integer id) {
        var germplasmToDelete = germplasmRepository.getReferenceById(id);

        if (germplasmToDelete.getDeletado() == true) {
            Map<String, String> message = new HashMap<String, String>();
            message.put("message", "Germoplasma já foi excluído");
            return message;
        }

        germplasmToDelete.delete();
        return null;
    }
}
