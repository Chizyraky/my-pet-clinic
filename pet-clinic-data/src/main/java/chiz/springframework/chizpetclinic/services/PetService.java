package chiz.springframework.chizpetclinic.services;

import chiz.springframework.chizpetclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long> {

    Set<Pet> findAll();
}
