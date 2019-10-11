package com.modificationAdresse.model;
import java.util.List;

public class Abonnee {
	private Long numAbonne;
	private String nom;
	private String prenom;
	private Condition condition ; 
	private List<Adresse> adresseList;
	private List<Contrat>contraList;
	
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	
	 public Condition getCondition() {
	        return condition;
	    }
	 
	public Long getNumAbonne() {
		return numAbonne;
	}

	public void setNumAbonne(Long numAbonne) {
		this.numAbonne = numAbonne;
	}

	public List<Adresse> getAdresseList() {
		return adresseList;
	}

	public void setAdresseList(List<Adresse> adresseList) {
		this.adresseList = adresseList;
	}

	public List<Contrat> getContraList() {
		return contraList;
	}

	public void setContraList(List<Contrat> contraList) {
		this.contraList = contraList;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	}
