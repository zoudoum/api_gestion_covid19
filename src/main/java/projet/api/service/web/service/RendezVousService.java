package projet.api.service.web.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import projet.api.service.web.entite.Patient;
import projet.api.service.web.entite.RendezVous;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.repository.RendezVousRepository;

@Service
public class RendezVousService {
    private PatientService patientService;
    private StructureDeSanteService structureDeSanteService;
    private RendezVousRepository rendezVousRepository;

    public RendezVousService(PatientService patientService, StructureDeSanteService structureDeSanteService,RendezVousRepository rendezVousRepository) {
        this.patientService = patientService;
        this.structureDeSanteService = structureDeSanteService;
        this.rendezVousRepository=rendezVousRepository;
    }

    public ResponseEntity<RendezVous> creer(RendezVous rendezVous) {
        Patient patient=this.patientService.lire(rendezVous);
        StructureDeSante structureDeSante=this.structureDeSanteService.lire(rendezVous);
        rendezVous.setPatient(patient);
        rendezVous.setStructure(structureDeSante);
        RendezVous rv = this.rendezVousRepository.save(rendezVous);
        return ResponseEntity.status(HttpStatus.CREATED).body(rv);

    }
}
