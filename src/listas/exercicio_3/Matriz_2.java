package src.listas.exercicio_3;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas e colunas: ");
        int m = sc.nextInt(); //linha
        int n = sc.nextInt(); //coluna
        sc.nextLine();

        int[][] matriz= new int[m][n]; //3 linhas, 4 colunas

        // Inserir matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Informações sobre algum numero
        System.out.println("Insira um número para saber sua posição na matriz: ");
        int numeroEscolhido = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numeroEscolhido) {
                    System.out.println("Posição: " + i + ", " + j + ": ");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Topo: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
