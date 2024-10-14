package com.Vaccination.entities;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "t_employes")
public class employes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nom;
    private String prenom;
    private int id_centre;
    private String role;
    private int telephone;

    public employes(  String nom, String prenom, int id_centre, String role, Boolean is_med, int telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.id_centre = id_centre;
        this.role = role;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getId_centre() {
        return id_centre;
    }
    public void setId_centre(int id_centre) {
        this.id_centre = id_centre;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int gettelephone() {
        return telephone;
    }
    public void setTelephone(int Telephone) {
        telephone = Telephone;
    }

}