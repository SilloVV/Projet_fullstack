package com.Vaccination.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaccination.entities.patient;
import com.Vaccination.repositories.PatientRepository;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepository patientRepository;

    //Trouver un patient par son nom 
    public List<patient> trouverParNom(String nom) {
        return patientRepository.findByNom(nom);
    }

    public patient ajouterPatient(patient patient) {
        return patientRepository.save(patient);
    }
}
