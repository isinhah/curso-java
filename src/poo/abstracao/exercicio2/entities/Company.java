package src.poo.abstracao.exercicio2.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10 ) {
            return getAnnualIncome() * (14.0 / 100);
        } else {
            return getAnnualIncome() * (16.0 / 100);
        }
    }
}
