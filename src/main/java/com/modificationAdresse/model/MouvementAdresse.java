package com.modificationAdresse.model;

import java.util.Date;

public class MouvementAdresse {
	private Conseiller conseiller;
	private Adresse adresse;
	private Date dateEffet;

	public Date getDateEffet() {
		return dateEffet;
	}
	public void setDateEffet(Date dateEffet) {
		this.dateEffet = dateEffet;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	}
