

package com.Vaccination.projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Vaccination.projet.Repositories.PatientRepo;
import com.Vaccination.projet.entities.patient;
import com.Vaccination.projet.services.PatientService;

import java.util.List;

@RestController
public class PatientController {

    private final PatientService patientservice;

    // Injection par constructeur
    public PatientController(PatientService patientservice) {
        this.patientservice = patientservice;
    }

    @GetMapping("/patients")
    public List<patient> getPatients() {
        System.out.println(patientservice.findAllPatients());
        return patientservice.findAllPatients();
    }
}
