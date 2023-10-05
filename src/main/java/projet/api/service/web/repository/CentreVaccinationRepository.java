package projet.api.service.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.api.service.web.entite.CentreVaccination;

public interface CentreVaccinationRepository extends JpaRepository<CentreVaccination,Integer> {
}
