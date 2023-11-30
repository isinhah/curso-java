package src.poo.tratamento.exercicio2.model.entities;

import src.poo.tratamento.exercicio2.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder; //titular
    private Double balance; //saldo
    private Double withdrawLimit; //limite de saque

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // Métodos
    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(Double amount) {
        if (amount > getBalance()) {
            throw new DomainException("Não é possivel fazer o saque! Não há saldo na conta");
        }
        if (amount > getWithdrawLimit()) {
            throw new DomainException("Não é possível fazer o saque! Ultrapassou o limite de saque da conta");
        }
    }
}
