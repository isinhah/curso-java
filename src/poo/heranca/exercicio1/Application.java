package src.poo.heranca.exercicio1;

import src.poo.heranca.exercicio1.entities.Account;
import src.poo.heranca.exercicio1.entities.BusinessAccount;

public class Application {
    public static void main(String[] args) {
        Account acc = new Account(1001, "isabel", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);


    }
}
