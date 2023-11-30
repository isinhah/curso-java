package src.base.array.exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //quantidade de produtos
        Product[] vect = new Product[n];

        for (int i = 0; i< vect.length; i++) {
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (Product product : vect) {
            sum += product.getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg );

        sc.close();
    }
}
