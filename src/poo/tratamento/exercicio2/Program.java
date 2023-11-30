package src.poo.tratamento.exercicio2;


import src.poo.tratamento.exercicio2.model.entities.Account;
import src.poo.tratamento.exercicio2.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        sc.next();
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
