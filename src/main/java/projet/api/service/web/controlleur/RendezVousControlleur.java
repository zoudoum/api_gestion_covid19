package projet.api.service.web.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projet.api.service.web.entite.RendezVous;
import projet.api.service.web.service.RendezVousService;

@RestController
@RequestMapping(path = "rendezvous")
public class RendezVousControlleur {
    private RendezVousService rendezVousService;

    public RendezVousControlleur(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping()
    public ResponseEntity<RendezVous> creer(@RequestBody RendezVous rendezVous){
        return this.rendezVousService.creer(rendezVous);
    }
}
