package domainService;

import aggregate.Pet;
import aggregate.User;
import aggregate.Vet;
import aggregate.VetHospital;

import java.util.Scanner;

public class Main {

    private static final long HEALTH_CHECK = 1000;
    public static final VetHospital vetHospital = new VetHospital();
    public static final User user = new User("Петя");
    public static final Pet pet = new Pet(user, new IllHistoryBase("Кошка Мурка"), "Кошка Мурка");
    public static final Vet vet = new Vet("Вася", vetHospital);

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            vetHospital.addPet(pet);
            Pet checkingPet = vet.next();
            System.out.println(checkingPet.getIllHistory().read());
            Thread.sleep(HEALTH_CHECK);
            System.out.println("Введите информацию для записи");
            String info = scanner.nextLine();
            checkingPet.getIllHistory().add(vet, info);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
