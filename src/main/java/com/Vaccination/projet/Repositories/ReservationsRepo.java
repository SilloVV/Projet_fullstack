package com.Vaccination.projet.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaccination.projet.entities.reservations;



public interface ReservationsRepo extends JpaRepository<reservations, Integer> {

    
}
