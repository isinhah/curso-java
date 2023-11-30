package src.array.exercicio_8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int vetorA[] = new int[n];
        int vetorB[] = new int[n];
        int vetorC[] = new int[n];

        System.out.println("Digite os valores do setor A: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d número -> ", (i+1));
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do setor B: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d número -> ", (i+1));
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma = vetorA[i] + vetorB[i];
            System.out.println(soma);
        }

        sc.close();
    }
}
