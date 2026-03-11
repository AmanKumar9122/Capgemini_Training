import java.util.*;

public class SetOperations {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);

        for (Integer n : numbers) {
            System.out.println(n);
        }

        System.out.println(numbers.contains(20));

        numbers.remove(30);

        for (Integer n : numbers) {
            System.out.println(n);
        }

        Set<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Delhi");

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println(cities.size());
    }
}