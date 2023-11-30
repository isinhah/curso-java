package src.classes_utilitarias.files.exercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"good morning", "good afternoon", "good night"};

        String path = "/home/isa/Documents/teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); //quebra de linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
