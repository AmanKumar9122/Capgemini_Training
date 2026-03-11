import java.util.*;

class Product {
    private Integer id;
    private String name;
    private Double price;

    Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product p = (Product) obj;
        return Objects.equals(id, p.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Set<Product> inventory = new HashSet<>();

        inventory.add(new Product(1, "Laptop", 70000.0));
        inventory.add(new Product(2, "Mouse", 500.0));
        inventory.add(new Product(1, "Laptop", 70000.0));
        inventory.add(new Product(3, "Keyboard", 1500.0));

        for (Product p : inventory) {
            System.out.println(p);
        }

        List<Integer> quantities = new ArrayList<>();
        quantities.add(10);
        quantities.add(20);
        quantities.add(15);

        int total = 0;
        for (Integer q : quantities) {
            total += q;
        }

        System.out.println(total);
    }
}