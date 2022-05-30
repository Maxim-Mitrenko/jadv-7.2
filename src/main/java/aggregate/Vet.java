package aggregate;

public class Vet {

    private final String name;
    private final VetHospital vetHospital;

    public Vet(String name, VetHospital vetHospital) {
        this.name = name;
        this.vetHospital = vetHospital;
    }

    public Pet next() {
        return vetHospital.getPets().poll();
    }

    @Override
    public String toString() {
        return name;
    }
}
