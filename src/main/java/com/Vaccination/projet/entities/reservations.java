package com.Vaccination.projet.entities;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;


@Entity
@Table(name = "t_reservations")
public class reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private LocalDate jour;
    private String creneau;
    private Boolean is_validated;

    @ManyToOne
    @JoinColumn(name = "id_centre", foreignKey = @jakarta.persistence.ForeignKey(name = "fk_id_centre"))
    private centres centre;

    @ManyToOne
    @JoinColumn(name = "id_patient", foreignKey = @jakarta.persistence.ForeignKey(name = "fk_id_patient"))
    private patient patient;

    @ManyToOne
    @JoinColumn(name = "id_employe")
    private employes employe;

    public reservations(patient patient, centres centre, employes medecin, Boolean is_validated, LocalDate jour, String creneau) {
        this.patient = patient;
        this.centre = centre;
        this.employe = medecin;
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
    

    public patient getPatient(){
        return this.patient;
    }
    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public centres getCentre(){
        return this.centre;
    }

    public void setCentre(centres centre){
        this.centre = centre;
    }

    public employes getemploye(){
        return this.employe;
    }

    public void setEmploye(employes medecin){
        this.employe = medecin;
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
