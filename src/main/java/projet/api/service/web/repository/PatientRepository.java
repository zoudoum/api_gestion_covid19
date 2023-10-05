package projet.api.service.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.api.service.web.entite.Patient;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
