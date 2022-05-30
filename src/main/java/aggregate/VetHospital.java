package aggregate;

import java.util.*;

public class VetHospital {

    private final List<Vet> vets = new ArrayList<>();
    private final Queue<Pet> pets = new ArrayDeque<>();


    public void addVet(Vet vet) {
        vets.add(vet);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public Queue<Pet> getPets() {
        return pets;
    }
}
