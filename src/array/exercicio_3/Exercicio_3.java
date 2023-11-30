package src.array.exercicio_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Ler numero inteiro positivo (até 10)
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        // Array numeros pode ter apenas n elementos
        int numeros[] = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        // Para cada elemento do array numeros, vai mostrar os negativos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[n] < 0) {
                System.out.println(numeros[n]);
            }
        }

        sc.close();
    }
}
