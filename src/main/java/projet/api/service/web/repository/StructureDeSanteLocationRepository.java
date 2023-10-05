package projet.api.service.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.api.service.web.entite.StructureDeSanteLocation;

public interface StructureDeSanteLocationRepository extends JpaRepository<StructureDeSanteLocation,Integer> {
}
