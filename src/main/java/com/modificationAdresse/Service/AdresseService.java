package com.modificationAdresse.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modificationAdresse.Repository.*;
import com.modificationAdresse.model.*;
@Service
public class AdresseService {

	 @Autowired
	 AdresseRepository adresseRepository;
	 	 
    public Adresse createOrUpdateAdresse(Adresse entity)   {
        Optional<Adresse> adresse = adresseRepository.findById(entity.getId());      
        if(adresse.isPresent())
        {
        	Adresse newAdresse = adresse.get();
        	newAdresse.setId(entity.getId());
        	newAdresse.setCodePostale(entity.getCodePostale());
        	newAdresse.setNomRue(entity.getNomRue());
        	newAdresse.setPay(entity.getPay());
        	newAdresse.setPrincipale(entity.getPrincipale());
        	newAdresse.setNumRue(entity.getNumRue());
        	newAdresse.setEtat(entity.getEtat());       	
            newAdresse = adresseRepository.save(newAdresse);            
            return newAdresse;
        } else {
            entity = adresseRepository.save(entity);          
            return entity;
        }
    }
}