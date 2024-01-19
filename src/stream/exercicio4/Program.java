package src.stream.exercicio4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full path: ");
        String path = sc.nextLine();

        System.out.println("Enter salary: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            // Leitura do arquivo
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(","); //split -> nome, email, salario
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            //Funçao que compara dois strings por ordem alfabetica
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            // Email das pessoas que tem o salário > 2000.00
            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            // Soma do salário das pessoas que tem o nome começando com M
            List<String> names = list.stream()
                    .filter(x -> x.getName().startsWith("M"))
                    .map(x -> String.valueOf(x.getSalary())) // Convertendo os salários para strings
                    .collect(Collectors.toList());

            double totalSalary = names.stream()
                    .mapToDouble(Double::parseDouble) // Convertendo os salários para double (ajuste conforme o tipo real)
                    .sum();

            System.out.println("Salário total das pessoas que possuem um nome com a inicial 'M': " + totalSalary);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
