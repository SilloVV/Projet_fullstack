

package com.Vaccination.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Vaccination.entities.patient;
import com.Vaccination.services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    //Endpoint pour chercher un patient par son nom
    @GetMapping("/recherche-par-nom")
    public List<patient> rechercherParNom(@RequestParam String nom) {
        return patientService.trouverParNom(nom);
    }

    @PostMapping("/ajout")
    public patient ajouterPatient(@RequestBody patient patient) {
        return patientService.ajouterPatient(patient);
    }
}
