package chiz.springframework.chizpetclinic.services;

import chiz.springframework.chizpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save (Pet owner);
    Set<Pet> findAll();
}
