package germplasm.database.api.repository;

import germplasm.database.api.model.Germplasm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface GermplasmRepository extends JpaRepository<Germplasm, Integer> {

    @Query(value = "SELECT * FROM germplasm WHERE deletado = 0", nativeQuery = true)
    List<Germplasm> findAllByDeletadoFalse();
}
