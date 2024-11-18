package com.Vaccination.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaccination.projet.Repositories.CentresRepository;
import com.Vaccination.projet.entities.centres;

@Service
public class CentreService {
    
    @Autowired
    private CentresRepository centrerepo;

    public CentreService(CentresRepository centrerepo) {
        this.centrerepo = centrerepo;
    }

    public List<centres> getAllCentres(){
    
        return centrerepo.findAll();
    }

    public List<centres> getCentreByCity(String ville){
        return centrerepo.findCentreByVille(ville);

    }

    public centres getCentreById(int id){
        return centrerepo.findCentreById(id);
    }

    public void addCentre(centres centre){
         centrerepo.save(centre);
    }

}

   
