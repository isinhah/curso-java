package src.listas.exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //quantidade de linhas

        //Matriz do tipo int e bidimensional, n linhas e n colunas
        int[][] matriz = new int[n][n];

        // Inserindo dados na matriz
        for (int i = 0; i < matriz.length; i++) { // Linhas
            for (int j = 0; j < matriz[i].length; j++) { // Colunas, 'j < n' ou 'matriz[i].length
                matriz[i][j] = sc.nextInt(); // A linha i vai receber a coluna j
            }
        }
        
        // Imprimir diagonal principal (do meio)
        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i] + " ");
        }
        
        // Encontrar numeros negativos
        int count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
