package com.Vaccination.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaccination.entities.reservations;



public interface ReservationsRepository extends JpaRepository<reservations, Integer> {

    
}

