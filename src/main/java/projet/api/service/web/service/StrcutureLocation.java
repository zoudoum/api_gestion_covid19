package projet.api.service.web.service;

import org.springframework.stereotype.Service;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.entite.StructureDeSanteLocation;
import projet.api.service.web.repository.StructureDeSanteLocationRepository;
import projet.api.service.web.repository.StructureDeSanteRepository;

import java.util.List;

@Service
public class StrcutureLocation {
    private StructureDeSanteLocationRepository structureDeSanteLocationRepository;

    public StrcutureLocation(StructureDeSanteLocationRepository structureDeSanteLocationRepository) {
        this.structureDeSanteLocationRepository = structureDeSanteLocationRepository;
    }

    public List<StructureDeSanteLocation> getStructuresLocation() {
        return this.structureDeSanteLocationRepository.findAll();
    }
}
