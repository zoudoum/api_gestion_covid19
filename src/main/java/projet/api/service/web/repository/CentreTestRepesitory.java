package projet.api.service.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.api.service.web.entite.CentreTest;

public interface CentreTestRepesitory extends JpaRepository<CentreTest,Integer> {
}
