package com.modificationAdresse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.modificationAdresse.model.Abonnee;

@Repository
public interface AbonneRepository  extends JpaRepository<Abonnee,Long>{
 
	
}
