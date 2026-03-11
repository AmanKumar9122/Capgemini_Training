import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class ProductCatalog {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 70000));
        products.add(new Product(2, "Mouse", 500));
        products.add(new Product(3, "Keyboard", 1500));
        products.add(new Product(4, "Monitor", 12000));

        for (Product p : products) {
            System.out.println(p);
        }

        double total = 0;

        for (Product p : products) {
            total += p.price;
        }

        System.out.println(total);

        products.remove(1);

        for (Product p : products) {
            System.out.println(p);
        }

        products.sort((a, b) -> Double.compare(a.price, b.price));

        for (Product p : products) {
            System.out.println(p);
        }
    }
}