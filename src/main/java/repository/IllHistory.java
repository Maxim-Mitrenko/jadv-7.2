package repository;

import aggregate.Vet;

public interface IllHistory {

    public String read();

    public void add(Vet vet, String illData);
}
