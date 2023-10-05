package projet.api.service.web.entite;

import jakarta.persistence.*;

@Entity
public class StructureDeSanteLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private double latitude;


    private double longitude;

    @ManyToOne
    @JoinColumn(name = "structure_id")
    private StructureDeSante structureDeSante;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public StructureDeSante getStructureDeSante() {
        return structureDeSante;
    }

    public void setStructureDeSante(StructureDeSante structureDeSante) {
        this.structureDeSante = structureDeSante;
    }
}
