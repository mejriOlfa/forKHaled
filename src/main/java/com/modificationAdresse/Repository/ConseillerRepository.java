package com.modificationAdresse.Repository;

import java.util.List;
import java.util.Map;

import com.modificationAdresse.model.Conseiller;

public class ConseillerRepository implements ObjectRepository<Conseiller>{

	private Map<Integer, Conseiller> repository;

	@Override
	public void store(Conseiller conseiller) {
		repository.put(conseiller.getId(), conseiller);
		
	}

	@Override
	public Conseiller retrieve(int id) {
		return repository.get(id);

	}

	@Override
	public Conseiller search(String nom) {
		List <Conseiller> calanList = (List<Conseiller>) repository.values();
		for (Conseiller Conseiller : calanList) {
			if (Conseiller.getNom().equalsIgnoreCase(nom))
				return Conseiller;
		}
		return null;
	}

	@Override
	public Conseiller delete(int id) {
		Conseiller e = repository.get(id);
		this.repository.remove(id);
		return e;
	}

}



