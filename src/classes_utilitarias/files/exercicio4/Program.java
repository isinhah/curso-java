package src.classes_utilitarias.files.exercicio4;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Lista apenas diretórios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //Lista apenas arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        //Criação de subpasta no caminho dado pelo usuário
        File newDir = new File(strPath + "/subpasta"); //Windos: \\subpasta
        boolean success = false;
        try {
            success = newDir.mkdir();
            if (success) {
                System.out.println("Diretório criado com sucesso.");
            } else {
                System.out.println("Falha ao criar diretório.");
            }
        } catch (SecurityException e) {
            System.out.println("Permissão negada para criar diretório: " + e.getMessage());
        }

        sc.close();
    }
}
