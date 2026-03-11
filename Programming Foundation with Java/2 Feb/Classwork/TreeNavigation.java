import java.util.*;

public class TreeNavigation {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.higher(30));
        System.out.println(set.lower(30));

        for (Integer s : set) {
            System.out.println(s);
        }

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.put(5, "E");
        map.put(4, "D");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.higherKey(3));
        System.out.println(map.lowerKey(3));

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}