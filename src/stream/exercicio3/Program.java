package src.stream.exercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            // Leitura do arquivo
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(","); //split -> nome, preço
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); //0 -> nome, 1 -> preço
                line = br.readLine();
            }

            // Média do preço dos produtos
            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            //Funçao que compara dois strings por ordem alfabetica
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //Ordenar os elementos que possuem preço abaixo da média de forma decrescente
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg) //filtro de produtos abaixo da média
                    .map(p -> p.getName()) //nome de cada produto filtrado
                    .sorted(comp.reversed()) //em ordem decrescente
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
