package com.modificationAdresse.model;

public class Adresse {
	private Long id;
	private String numRue;
	private String nomRue;
	private String codePostale;
	private String pay;
	public  Etat etat;
	private Boolean principale;
	
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	 public Etat getEtat() {
	        return etat;
	    }
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPay() {
		return pay;
	}
	
	public void setPay(String pay) {
		this.pay = pay;
	}
	
	public String getNumRue() {
		return numRue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public Boolean getPrincipale() {
		return principale;
	}
	public void setPrincipale(Boolean principale) {
		this.principale = principale;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
