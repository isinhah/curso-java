package src.listas.exercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List <Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Employee #%d: \n", i+1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idEmployee = sc.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist! \n");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.increaseSalary(percent);
        }

        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}