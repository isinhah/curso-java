package src.poo.polimorfismo.exercicio2;

import src.poo.polimorfismo.exercicio2.entities.ImportedProduct;
import src.poo.polimorfismo.exercicio2.entities.Product;
import src.poo.polimorfismo.exercicio2.entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported? (c/u/i) ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.println("Customs fee: ");
                double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, date));
            } else if (ch == 'c') {
                products.add(new Product(name, price));
            } else {
                System.out.println("Letra errada. Tente novamente.");
            }
        }

        System.out.println("PRICE TAGS: \n: ");

        for (Product pd : products) {
            System.out.println(pd.priceTag());
        }

        sc.close();
    }
}
