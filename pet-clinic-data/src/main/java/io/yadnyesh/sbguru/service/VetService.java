package io.yadnyesh.sbguru.service;

import io.yadnyesh.sbguru.model.Owner;
import io.yadnyesh.sbguru.model.Vet;

import java.util.Set;

public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
