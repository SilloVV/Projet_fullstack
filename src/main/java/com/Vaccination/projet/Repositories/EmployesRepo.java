package com.Vaccination.projet.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaccination.projet.entities.employes;



public interface EmployesRepo extends JpaRepository<employes, Integer> {
    
    List<employes> findAllByCentreId(int id_centre);
    void deleteById(int id);



    
}
