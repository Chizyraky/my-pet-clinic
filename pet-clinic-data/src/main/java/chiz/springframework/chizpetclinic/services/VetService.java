package chiz.springframework.chizpetclinic.services;

import chiz.springframework.chizpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save (Vet vet);
    Set<Vet> findAll();
}
