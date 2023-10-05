package projet.api.service.web.service;

import org.springframework.stereotype.Service;
import projet.api.service.web.entite.RendezVous;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.entite.StructureDeSanteLocation;
import projet.api.service.web.repository.StructureDeSanteRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StructureDeSanteService {
    private StructureDeSanteRepository structureDeSanteRepository;

    private StrcutureLocation strcutureLocation;


    public StructureDeSanteService(StructureDeSanteRepository structureDeSanteRepository, StrcutureLocation strcutureLocation) {
        this.structureDeSanteRepository = structureDeSanteRepository;
        this.strcutureLocation = strcutureLocation;
    }

    public List<StructureDeSante> getStructures() {
        return this.structureDeSanteRepository.findAll();
    }

    public StructureDeSante lire(RendezVous rendezVous) {
        Optional<StructureDeSante> optionalStructure= this.structureDeSanteRepository.findById(rendezVous.getStructure().getId().intValue());
        if (optionalStructure.isPresent()){
            return  optionalStructure.get();
        }
        return  null;
    }




    public List<StructureDeSanteLocation> getStructuresLocation() {
        return this.strcutureLocation.getStructuresLocation();
    }
}
