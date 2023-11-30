package src.classes_utilitarias.files.exercicio2;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String path = "/home/isa/Documents/miau.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            //Leitura com o buffered reader
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
