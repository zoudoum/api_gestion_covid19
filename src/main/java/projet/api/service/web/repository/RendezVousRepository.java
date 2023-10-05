package projet.api.service.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.api.service.web.entite.RendezVous;

public interface RendezVousRepository extends JpaRepository<RendezVous,Integer> {
}
