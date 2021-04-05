package chiz.springframework.chizpetclinic.services;

import chiz.springframework.chizpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
