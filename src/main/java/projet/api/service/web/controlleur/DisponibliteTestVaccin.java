package projet.api.service.web.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projet.api.service.web.entite.CentreVaccination;
import projet.api.service.web.entite.RendezVous;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.service.CentreTestService;
import projet.api.service.web.service.CentreVaccinationService;

import java.util.List;

@RestController
@RequestMapping(path = "consulatation")
public class DisponibliteTestVaccin {
    private CentreVaccinationService centreVaccinationService;
    private CentreTestService centreTestService;

    public DisponibliteTestVaccin(CentreVaccinationService centreVaccinationService, CentreTestService centreTestService) {
        this.centreVaccinationService = centreVaccinationService;
        this.centreTestService = centreTestService;
    }


    @GetMapping(path = "vaccin")
    public List<StructureDeSante> getStructureVaccin(){
        return this.centreVaccinationService.getStructure();
    }
    @GetMapping(path = "test")
    public List<StructureDeSante> getStructureTest(){
        return this.centreTestService.getStructure();
    }
}
