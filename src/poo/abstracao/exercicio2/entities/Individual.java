package src.poo.abstracao.exercicio2.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (healthExpenditures < 20000.00) {
            return getAnnualIncome() * (15.0 / 100);
        } else {
            return getAnnualIncome() * (50.0 / 100);
        }
    }
}
