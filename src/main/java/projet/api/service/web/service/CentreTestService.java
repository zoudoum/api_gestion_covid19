package projet.api.service.web.service;

import org.springframework.stereotype.Service;
import projet.api.service.web.entite.CentreTest;
import projet.api.service.web.entite.CentreVaccination;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.repository.CentreTestRepesitory;
import projet.api.service.web.repository.StructureDeSanteRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CentreTestService {
    private CentreTestRepesitory centreTestRepesitory;
    private StructureDeSanteRepository structureDeSanteRepository;

    public CentreTestService(CentreTestRepesitory centreTestRepesitory, StructureDeSanteRepository structureDeSanteRepository) {
        this.centreTestRepesitory = centreTestRepesitory;
        this.structureDeSanteRepository = structureDeSanteRepository;
    }
    public List<StructureDeSante> getStructure() {
        List<CentreTest> centresAvecQuantiteDisponible = centreTestRepesitory.findAll();

        // Filtrer les centres en fonction de la quantité de doses disponibles
        List<CentreTest> centresFiltres = centresAvecQuantiteDisponible.stream()
                .filter(centre -> centre.getCapaciteTests() > 0)
                .collect(Collectors.toList());

        // Extraire les structures de santé associées à ces centres
        List<StructureDeSante> structuresAvecQuantiteDisponible = centresFiltres.stream()
                .map(CentreTest::getStructure)
                .collect(Collectors.toList());

        return structuresAvecQuantiteDisponible;
    }
}
