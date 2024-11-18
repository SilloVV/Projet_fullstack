package com.Vaccination.projet.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaccination.projet.entities.centres;



public interface CentresRepository extends JpaRepository<centres, Integer> {

    @SuppressWarnings("null")
    List<centres> findAll();
    centres findCentreById(int id);
    List<centres> findCentreByVille(String ville);
   


}
