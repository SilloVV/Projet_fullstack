package com.Vaccination.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Vaccination.entities.patients;



public interface PatientsRepository extends JpaRepository<patients, Integer> {

    
}

