import java.util.*;

public class MapOperations {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Aman");
        employees.put(102, "Rahul");
        employees.put(103, "Neha");
        employees.put(104, "Karan");

        System.out.println(employees.get(101));

        for (Integer id : employees.keySet()) {
            System.out.println(id + " " + employees.get(id));
        }

        employees.remove(103);

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(employees.containsKey(102));
        System.out.println(employees.containsValue("Aman"));
    }
}