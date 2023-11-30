package src.array.exercicio_13;

import java.util.Locale;
import java.util.Scanner;

public class Dados_Pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas?");
        int n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %d pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Gênero da %d pessoa: ", i+1);
            sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
            System.out.print("Gênero (M/F): ");
            char genero = sc.nextLine().charAt(0);

            pessoa[i] = new Pessoa(altura, genero);
        }

        //Calcular maior e menor altura do grupo
        double maiorAltura = pessoa[0].getHeight();
        double menorAltura = pessoa[0].getHeight();
        for (int i = 0; i < n; i++) {
            if (pessoa[i].getHeight() > maiorAltura) {
                maiorAltura = pessoa[i].getHeight();
            }
            if (pessoa[i].getHeight() < menorAltura) {
                menorAltura = pessoa[i].getHeight();
            }
        }

        //Calculo da media da altura das mulheres e homens
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double alturaHomTotal = 0;
        double alturaFemTotal = 0;
        for (int i = 0; i < n; i++) {
            if (pessoa[i].getGender() == 'M') {
                qtdHomens++;
                alturaHomTotal += pessoa[i].getHeight();
            } else if (pessoa[i].getGender() == 'F') {
                qtdMulheres++;
                alturaFemTotal += pessoa[i].getHeight();
            } else {
                System.out.println("Você digitou errado. Escolha M ou F.");
            }
        }

        double alturaFemMedia = alturaFemTotal / qtdMulheres;
        double alturaHomMedia = alturaHomTotal / qtdHomens;

        // Imprimir mensagem das alturas
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", alturaFemMedia);
        System.out.printf("Média das alturas dos homens = %.2f\n", alturaHomMedia);
        System.out.printf("Quantidade de mulheres: %d\n", qtdMulheres);
        System.out.printf("Quantidade de homens: %d\n", qtdHomens);

        sc.close();
    }
}
