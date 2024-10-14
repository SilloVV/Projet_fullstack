package com.Vaccination.entities;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
@Table(name = "t_reservations")
public class reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int id_patient;
    private int id_centre;
    private LocalDate jour;
    private String creneau;
    private Boolean is_validated;

  

    public reservations(int id_patient, int id_centre, Boolean is_validated, LocalDate jour, String creneau) {
        this.id_patient = id_patient;
        this.id_centre = id_centre;
        this.is_validated = is_validated;
        this.jour = jour;
        this.creneau = creneau;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_patient() {
        return id_patient;
    }
    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }
    public int getId_centre() {
        return id_centre;
    }
    public void setId_centre(int id_centre) {
        this.id_centre = id_centre;
    }
    public LocalDate getJour() {
        return jour;
    }
    public void setDate(LocalDate jour) {
        this.jour = jour;
    }
    public String getCreneau() {
        return creneau;
    }
    public void setCreneau(String creneau) {
        this.creneau = creneau;
    }
    public Boolean getIs_validated() {
        return is_validated;
    }

    public void setIs_validated(Boolean is_validated) {
        this.is_validated = is_validated;
    }
 
}
