package projet.api.service.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.api.service.web.entite.StructureDeSante;

import java.util.Optional;

public interface StructureDeSanteRepository extends JpaRepository<StructureDeSante,Integer> {

}
