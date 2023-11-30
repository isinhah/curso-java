package src.base.array.exercicio_12;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int n = sc.nextInt();

        String[] alunos = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda do %d aluno: \n", i+1);
            sc.nextLine();
            alunos[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            double media = notas1[i] + notas2[i] / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", alunos[i]);
            }
        }

        sc.close();
    }
}
