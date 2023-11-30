package src.base.array.exercicio_10;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        int somaPares = 0;
        int npares = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) somaPares / npares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }



        sc.close();
    }
}
