package com.modificationAdresse.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.modificationAdresse.model.Adresse;

@Repository
public class AdresseRepository implements ObjectRepository<Adresse> {

	private Map<Integer, Adresse> repository;

	public AdresseRepository() {
		this.repository = new HashMap<>();
	}

	@Override
	public void store(Adresse adr) {
		repository.put((int) adr.getId(), adr);
	}

	@Override
	public Adresse retrieve(int id) {
		return repository.get(id);
	}

	@Override
	public Adresse search(String nom) {
		List <Adresse> adresseList = (List<Adresse>) repository.values();
		for (Adresse adr : adresseList) {
			if (adr.getNomRue().equalsIgnoreCase(nom))
				return adr;
		}
		return null;
	}

	@Override
	public Adresse delete(int id) {
		Adresse e = repository.get(id);
		this.repository.remove(id);
		return e;
	}
	
}