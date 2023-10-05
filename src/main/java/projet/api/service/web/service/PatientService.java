package projet.api.service.web.service;

import org.springframework.stereotype.Service;
import projet.api.service.web.entite.Patient;
import projet.api.service.web.entite.RendezVous;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.repository.PatientRepository;

import java.util.Optional;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient lire(RendezVous rendezVous) {
        Optional<Patient> optionalPatient= this.patientRepository.findById(rendezVous.getPatient().getId().intValue());
        if (optionalPatient.isPresent()){
            return  optionalPatient.get();
        }
        return  null;
    }
}
