package src.poo.enums_composicao.exercicio_4.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {}

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem(int quantity, double productPrice, Product product) {
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return product.getName() + ", R$" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: R$" + String.format("%.2f", subTotal());
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
