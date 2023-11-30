package src.array.exercicio_7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();

        double vetor[] = new double[n];
        double maior = vetor[0]; //considerando que o maior está na posição 0 do vetor
        int posicaoMaior = 0; //considerando que a posição atual é 0

        // Armazenar no vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        //Maior valor e sua posição
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.\n", maior);
        System.out.print("POSIÇÃO DO MAIOR VALOR: " + posicaoMaior);

        sc.close();
    }
}
