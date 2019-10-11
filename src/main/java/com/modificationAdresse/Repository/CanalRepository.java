package com.modificationAdresse.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.modificationAdresse.model.Adresse;
import com.modificationAdresse.model.Canal;

@Repository
public class CanalRepository implements ObjectRepository<Canal>{
	private Map<Integer, Canal> repository;

	@Override
	public void store(Canal canal) {
		repository.put((int) canal.getId(), canal);
		
	}

	@Override
	public Canal retrieve(int id) {
		return repository.get(id);

	}

	@Override
	public Canal search(String nom) {
		List <Canal> calanList = (List<Canal>) repository.values();
		for (Canal canal : calanList) {
			if (canal.getLibelle().equalsIgnoreCase(nom))
				return canal;
		}
		return null;
	}

	@Override
	public Canal delete(int id) {
		Canal e = repository.get(id);
		this.repository.remove(id);
		return e;
	}

}
