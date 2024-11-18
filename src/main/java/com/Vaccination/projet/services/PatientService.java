package com.Vaccination.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaccination.projet.Repositories.PatientRepo;
import com.Vaccination.projet.entities.patient;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepo patientrepo;

    public PatientService(PatientRepo patientrepo) {
        this.patientrepo = patientrepo;
    }

    public List<patient> findAllPatients() {
        return patientrepo.findAll();
    }
}
