package src.array.exercicio_11;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Idade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantas pessoas? ");
        n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %d pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            pessoa[i] = new Pessoa(name, age);
        }

        // Pessoa mais velha
        int posicaoMaior = 0;
        int maisVelho = pessoa[0].getAge(); // Inicializa na primeira posição da lista
        for (int i = 0; i < n; i++) {
            int idadeAtual = pessoa[i].getAge();
            if (idadeAtual > maisVelho) {
                maisVelho = idadeAtual;
                posicaoMaior = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s, sua idade: %d", pessoa[posicaoMaior].getName(), pessoa[posicaoMaior].getAge());

        sc.close();
    }
}
