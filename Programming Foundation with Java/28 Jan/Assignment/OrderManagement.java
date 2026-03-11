import java.util.*;

enum OrderStatus {
    PLACED, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}

class Order {
    private int id;
    private String product;
    private OrderStatus status;

    public Order(int id, String product) {
        this.id = id;
        this.product = product;
        this.status = OrderStatus.PLACED;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }

    public void display() {
        System.out.println(id + " " + product + " " + status);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order(101, "Laptop");
        Order o2 = new Order(102, "Keyboard");

        o1.display();
        o2.display();

        o1.updateStatus(OrderStatus.SHIPPED);
        o2.updateStatus(OrderStatus.CANCELLED);

        o1.display();
        o2.display();
    }
}