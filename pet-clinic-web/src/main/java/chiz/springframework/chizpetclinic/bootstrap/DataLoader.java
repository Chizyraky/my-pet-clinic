package chiz.springframework.chizpetclinic.bootstrap;

import chiz.springframework.chizpetclinic.model.Owner;
import chiz.springframework.chizpetclinic.model.Vet;
import chiz.springframework.chizpetclinic.services.OwnerService;
import chiz.springframework.chizpetclinic.services.VetService;
import chiz.springframework.chizpetclinic.services.map.OwnerServiceMap;
import chiz.springframework.chizpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Brad");
        owner1.setLastName("Pete");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("John");
        owner2.setLastName("Jane");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Smith");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Judith");
        vet2.setLastName("Doll");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
