package src.interfaces.exercicio1.model.entities.services;

public class BrazilTaxService implements TaxService {
    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2; //20%
        } else {
            return amount * 0.15; //15%
        }
    }
}