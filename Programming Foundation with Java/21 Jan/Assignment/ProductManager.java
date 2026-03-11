import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValue() {
        return price * quantity;
    }

    public void display() {
        System.out.println(id + " " + name + " " + price + " " + quantity + " " + totalValue());
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product(101, "Laptop", 60000, 5);
        Product p2 = new Product(102, "Mouse", 500, 20);

        p1.display();
        p2.display();

        p1.setQuantity(10);
        p2.setPrice(450);

        p1.display();
        p2.display();
    }
}