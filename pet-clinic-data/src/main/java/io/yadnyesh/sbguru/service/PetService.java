package io.yadnyesh.sbguru.service;

import io.yadnyesh.sbguru.model.Pet;

import java.util.Set;

public interface PetService {
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
