import java.util.*;

public class DataStructureComparison {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        for (Integer i : list) {
            System.out.println(i);
        }

        Map<Integer, String> tree = new HashMap<>();

        tree.put(1, "Root");
        tree.put(2, "Left");
        tree.put(3, "Right");

        for (Map.Entry<Integer, String> e : tree.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(10);
        queue.add(15);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}