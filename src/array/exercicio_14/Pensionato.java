package src.array.exercicio_14;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        // 10 quartos
        Rent[] vect = new Rent[10];

        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #%d \n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            //Atribuindo a instância do objeto ao vetor na posição do numero do quarto
            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.print(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
