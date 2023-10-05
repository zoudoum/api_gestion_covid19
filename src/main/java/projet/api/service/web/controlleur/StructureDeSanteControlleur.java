package projet.api.service.web.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.entite.StructureDeSanteLocation;
import projet.api.service.web.service.StructureDeSanteService;

import java.util.List;

@RestController
@RequestMapping(path = "structure")
public class StructureDeSanteControlleur {
    private StructureDeSanteService structureDeSanteService;

    public StructureDeSanteControlleur(StructureDeSanteService structureDeSanteService) {
        this.structureDeSanteService = structureDeSanteService;
    }

    @GetMapping()
    public List<StructureDeSante> getAllStructure(){
        return structureDeSanteService.getStructures();
    }
    @GetMapping(path = "location")
    public List<StructureDeSanteLocation> getAllStructureLocation(){
        return structureDeSanteService.getStructuresLocation();
    }

}
