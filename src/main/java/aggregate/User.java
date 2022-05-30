package aggregate;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private final List<Pet> pets = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return name;
    }
}
