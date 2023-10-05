package projet.api.service.web.entite;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name ="PATIENT_ID")
    private Patient patient;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name ="STRUCTURE_ID")
    private StructureDeSante structure;

    private Date date;

    private String heure;
    private String typeRendezVous;

    public Long getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public StructureDeSante getStructure() {
        return structure;
    }

    public Date getDate() {
        return date;
    }

    public String getTypeRendezVous() {
        return typeRendezVous;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setStructure(StructureDeSante structure) {
        this.structure = structure;
    }

    public void setDate(Date dateHeure) {
        this.date= dateHeure;
    }

    public void setTypeRendezVous(String typeRendezVous) {
        this.typeRendezVous = typeRendezVous;
    }

    public String getHeure() {
        return heure;
    }
    // Getters et setters
}
