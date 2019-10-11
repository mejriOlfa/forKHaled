package com.modificationAdresse.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modificationAdresse.Repository.AbonneRepository;
import com.modificationAdresse.model.*;

@Service
public class AbonneeService {

	 @Autowired
	 AbonneRepository abonneeRep;
	 
	 public List<Abonnee> getAllEmployees()
	    {
	        List<Abonnee> abonneeList = abonneeRep.findAll();
	         
	        if(abonneeList.size() > 0) {
	            return abonneeList;
	        } else {
	            return new ArrayList<Abonnee>();
	        }
	    }
}
