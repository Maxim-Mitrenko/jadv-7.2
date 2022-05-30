package domainService;

import aggregate.Vet;
import repository.IllHistory;

import java.io.*;
import java.util.stream.Collectors;

public class IllHistoryBase implements IllHistory {

    private final File file;

    public IllHistoryBase(String name) {
        this.file = new File(name + ".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Не удалось историю болезни");
        }
    }

    @Override
    public String read() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            return bufferedReader.lines().collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void add(Vet vet, String illData) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            bufferedWriter.write("Ветеринар " + vet + ": " + illData + "\n");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
