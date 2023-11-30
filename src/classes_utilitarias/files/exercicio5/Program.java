package src.classes_utilitarias.files.exercicio5;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Acessando o nome do arquivo
        System.out.println("Nome: " + path.getName());

        //Acessando o caminho do arquivo
        System.out.println("Caminho: " + path.getParent());

        //Acessando o caminho inteiro do arquivo
        System.out.println("Caminho inteiro: " + path.getPath());

        sc.close();
    }
}
