package src.array.exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        // Armazenar cada pessoa na lista
        for (int i = 0; i < pessoa.length; i++) {
            System.out.printf("Dados da %d pessoa: %n", i + 1);
            sc.nextLine();
            System.out.printf("Nome: ");
            String name = sc.nextLine();
            System.out.printf("Idade: ");
            int age = sc.nextInt();
            System.out.printf("Altura: ");
            double height = sc.nextDouble();

            pessoa[i] = new Pessoa(name, age, height);
        }

        // Calcular altura média
        double sum = 0;
        for (int i = 0; i < pessoa.length; i++) {
            sum += pessoa[i].getHeight();
        }
        double avg = sum / pessoa.length;

        // Mostrar informação de cada pessoa
        for (int i = 0 ; i < pessoa.length; i++) {
            System.out.printf("%nDados da %d pessoa: %n", i + 1);
            System.out.printf("%nNome: " + pessoa[i].getName());
            System.out.printf("%nIdade: " + pessoa[i].getAge());
            System.out.printf("%nAltura: %.2f", pessoa[i].getHeight());
        }

        // Mostrar altura media
        System.out.printf("%nAltura média: %.2f%n", avg);

        // Ver quantas pessoas tem menos de 16 anos
        int menores = 0;
        System.out.printf("Pessoas com menos de 16 anos: %n");
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getAge() < 16) {
                System.out.println(pessoa[i].getName());
                menores++;
            }
        }

        //Calcular e mostrar o percentual de menores
        double percentualMenores = ((double)menores / n) * 100.0;
        System.out.printf("%nPercentual de pessoas com menos de 16 anos: %.1f%n", percentualMenores);

        sc.close();
    }
}
