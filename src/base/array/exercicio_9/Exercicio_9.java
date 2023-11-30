package src.base.array.exercicio_9;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double vetor[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        //Média aritmética de todos os elementos
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        double mediaAritmetica = soma / n;

        System.out.printf("MÉDIA DO VETOR = %.3f\n", mediaAritmetica);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < mediaAritmetica) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
