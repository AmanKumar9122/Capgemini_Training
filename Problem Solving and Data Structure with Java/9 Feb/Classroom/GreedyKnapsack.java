import java.util.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class GreedyKnapsack {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item(10, 60));
        items.add(new Item(20, 100));
        items.add(new Item(30, 120));

        items.sort((a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        int capacity = 50;
        double totalValue = 0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += ((double) item.value / item.weight) * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println(totalValue);
    }
}