package src.classes_utilitarias.files.exercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Instanciação do objeto File
        File file = new File("/home/isa/Documents/miau.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }  finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
