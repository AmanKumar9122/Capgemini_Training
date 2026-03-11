import java.util.*;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(Product p) {
        return Double.compare(this.price, p.price);
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class ProductSorting {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 70000));
        products.add(new Product(2, "Mouse", 500));
        products.add(new Product(3, "Keyboard", 1500));
        products.add(new Product(4, "Monitor", 12000));

        Collections.sort(products);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}