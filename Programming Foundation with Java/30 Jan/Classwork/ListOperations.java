import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Rahul");
        students.add("Neha");
        students.add("Karan");
        students.add("Anita");

        for (String s : students) {
            System.out.println(s);
        }

        students.remove("Karan");

        System.out.println(students.contains("Aman"));

        students.set(1, "Ravi");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        Collections.sort(students);

        for (String s : students) {
            System.out.println(s);
        }

        List<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(75);
        marks.add(92);
        marks.add(60);

        int total = 0;

        for (Integer m : marks) {
            total += m;
        }

        System.out.println(total);

        double avg = (double) total / marks.size();
        System.out.println(avg);
    }
}