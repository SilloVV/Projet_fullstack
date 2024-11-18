package com.Vaccination.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaccination.entities.patient;



public interface PatientsRepository extends JpaRepository<patient, Integer> {
        
    // Méthode pour rechercher par nom
    List<patient> findByNom(String nom);

    
}

