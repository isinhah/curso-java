package src.base.array.exercicio_6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int inteiros[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            inteiros[i] = sc.nextInt();
        }

        System.out.print("NUMEROS PARES: ");

        int pares = 0;
        for (int i = 0; i < n; i++) {
            if (inteiros[i] % 2 == 0) {
                System.out.print(inteiros[i] + " ");
                pares++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + pares );

        sc.close();
    }
}
