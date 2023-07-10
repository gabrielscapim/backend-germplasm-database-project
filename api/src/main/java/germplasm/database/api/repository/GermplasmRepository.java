package germplasm.database.api.repository;

import germplasm.database.api.model.Germplasm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GermplasmRepository extends JpaRepository<Germplasm, Integer> {
    Page<Germplasm> findAllByDeletadoFalse(Pageable pageable);
}
