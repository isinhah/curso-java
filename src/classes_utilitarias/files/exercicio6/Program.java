package src.classes_utilitarias.files.exercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        //Manipulação de arquivos
        System.out.println("Insira o caminho do arquivo: ");
        String strPath = sc.nextLine();

        File sourceFile = new File(strPath); //Criação de arquivo
        String sourceFolderStr = sourceFile.getParent(); //Caminho do arquivo
        boolean success = new File(sourceFolderStr + "/teste").mkdir(); //Criação da pasta
        String targetFileStr = sourceFolderStr + "/teste/summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String itemCsv = br.readLine(); //Leitura de cada linha

            while (itemCsv != null) {

                String[] fields = itemCsv.split(", ");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Produto(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Produto item : list) {
                    bw.write(item.getName() + ", " + String.format("%.2f", item.totalValue()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CRIADO");
            } catch(IOException e) {
                System.out.println("Erro de escrita: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro de escrita: " + e.getMessage());
        }

        sc.close();
    }
}
