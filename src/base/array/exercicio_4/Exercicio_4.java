package src.base.array.exercicio_4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        // Array
        double numeros[] = new double[n];

        // Armazenar no vetor
        for (int i = 0; i< n; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextDouble(); //armazenando o i no array numeros
        }

        System.out.print("VALORES: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", numeros[i]);
        }

        System.out.printf("%nSOMA = ");

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + numeros[i];
        }

        System.out.printf("%.2f", sum);

        System.out.printf("%nMEDIA = ");

        double avg = sum / numeros.length;

        System.out.printf("%.2f", avg);

        sc.close();
    }
}
