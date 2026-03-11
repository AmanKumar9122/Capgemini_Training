import java.util.*;

class Job {

    private Integer priority;
    private String name;
    private Integer salary;

    public Job(Integer priority, String name, Integer salary) {
        this.priority = priority;
        this.name = name;
        this.salary = salary;
    }

    public Integer getPriority() { return priority; }
    public String getName() { return name; }
    public Integer getSalary() { return salary; }

    @Override
    public String toString() {
        return "Job{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class PriorityComparator implements Comparator<Job> {
    @Override
    public int compare(Job a, Job b) {
        return a.getPriority().compareTo(b.getPriority());
    }
}

class NameComparator implements Comparator<Job> {
    @Override
    public int compare(Job a, Job b) {
        return a.getName().compareTo(b.getName());
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        // Using LinkedList
        List<Job> jobs = new LinkedList<>();

        jobs.add(new Job(2, "Dev", 50000));
        jobs.add(new Job(1, "QA", 40000));
        jobs.add(new Job(1, "Analyst", 45000));
        jobs.add(new Job(2, "Manager", 80000));

        jobs.sort(new PriorityComparator());
        System.out.println("Sort by priority:");
        jobs.forEach(System.out::println);

        System.out.println();

        jobs.sort(new NameComparator());
        System.out.println("Sort by name:");
        jobs.forEach(System.out::println);
    }
}