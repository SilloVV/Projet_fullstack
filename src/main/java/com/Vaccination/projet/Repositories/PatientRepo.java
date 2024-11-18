package com.Vaccination.projet.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaccination.projet.entities.patient;



public interface PatientRepo extends JpaRepository<patient, Integer> {
        
    // Méthode pour rechercher par nom
    List<patient> findByNom(String nom);

    
}
