package projet.api.service.web.service;

import org.springframework.stereotype.Service;
import projet.api.service.web.entite.CentreVaccination;
import projet.api.service.web.entite.StructureDeSante;
import projet.api.service.web.repository.CentreVaccinationRepository;
import projet.api.service.web.repository.StructureDeSanteRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CentreVaccinationService {
    private CentreVaccinationRepository centreVaccinationRepository;
    private StructureDeSanteRepository structureDeSanteRepository;

    public CentreVaccinationService(CentreVaccinationRepository centreVaccinationRepository, StructureDeSanteRepository structureDeSanteRepository) {
        this.centreVaccinationRepository = centreVaccinationRepository;
        this.structureDeSanteRepository = structureDeSanteRepository;
    }

    public List<StructureDeSante> getStructure() {
        List<CentreVaccination> centresAvecQuantiteDisponible = centreVaccinationRepository.findAll();


        List<CentreVaccination> centresFiltres = centresAvecQuantiteDisponible.stream()
                .filter(centre -> centre.getCapaciteVaccins()  > 0)
                .collect(Collectors.toList());

        // Extraire les structures de santé associées à ces centres
        List<StructureDeSante> structuresAvecQuantiteDisponible = centresFiltres.stream()
                .map(CentreVaccination::getStructure)
                .collect(Collectors.toList());

        return structuresAvecQuantiteDisponible;
    }
}
