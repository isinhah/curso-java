package src.interfaces.exercicio1.model.entities;

public class Invoice {
    private Double basicPayment;
    private Double tax;

    public Invoice() {}

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment() {
        return getBasicPayment() + getTax(); //get pois é mais fácil se quiser mudar a lógica da taxa
    }
}
