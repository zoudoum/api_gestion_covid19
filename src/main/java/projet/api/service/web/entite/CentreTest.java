package projet.api.service.web.entite;

import jakarta.persistence.*;

@Entity
public class CentreTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "STRUCTURE_ID")
    private StructureDeSante structure;

    private String disponibilite;
    private int capaciteTests;
    private String contact;

    public Long getId() {
        return id;
    }

    public StructureDeSante getStructure() {
        return structure;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public int getCapaciteTests() {
        return capaciteTests;
    }

    public String getContact() {
        return contact;
    }
    // Getters et setters
}





