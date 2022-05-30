package aggregate;

import repository.IllHistory;

public class Pet {

    private final User owner;
    private final IllHistory illHistory;
    private final String name;

    public Pet(User owner, IllHistory illHistory, String name) {
        this.owner = owner;
        this.illHistory = illHistory;
        this.name = name;
        owner.addPet(this);
    }

    public User getOwner() {
        return owner;
    }

    public IllHistory getIllHistory() {
        return illHistory;
    }

    @Override
    public String toString() {
        return name;
    }
}
