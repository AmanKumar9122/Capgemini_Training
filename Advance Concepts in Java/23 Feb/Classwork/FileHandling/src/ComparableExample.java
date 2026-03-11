//import java.util.*;
//class Job implements Comparable<Job> {
//    private Integer priority;
//    private String name;
//    private Integer salary;
//    public Job(Integer priority, String name, Integer salary) {
//        this.priority = priority;
//        this.name = name;
//        this.salary = salary;
//    }
//    public Integer getPriority() {
//        return priority;
//    }
//    public String getName() {
//        return name;
//    }
//    public Integer getSalary() {
//        return salary;
//    }
//    @Override
//    public int compareTo(Job other) {
//        // Example sorting: priority ascending
//        return this.priority.compareTo(other.priority);
//    }
//    @Override
//    public String toString() {
//        return "Job{" +
//                "priority=" + priority +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//    public static void main(String[] args) {
//        List<Job> jobs = new ArrayList<>();
//        jobs.add(new Job(3, "Dev", 50000));
//        jobs.add(new Job(1, "QA", 40000));
//        jobs.add(new Job(2, "Manager", 80000));
////        Collections.sort(jobs);
//        jobs.sort(null);
//        for (Job j : jobs) {
//            System.out.println(j);
//        }
//    }
//}
import java.util.*;
class ComparableExample implements Comparable<ComparableExample> {
    private Integer priority;
    private String name;
    private Integer salary;

    public ComparableExample(Integer priority, String name, Integer salary) {
        this.priority = priority;
        this.name = name;
        this.salary = salary;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    // Sort by priority first, then name
    @Override
    public int compareTo(ComparableExample other) {
        int p = this.priority.compareTo(other.priority);
        if (p != 0) return p;

        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Job{" +
                "priority=" + priority +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<ComparableExample> comparableExamples = new ArrayList<>();
        comparableExamples.add(new ComparableExample(2, "Dev", 50000));
        comparableExamples.add(new ComparableExample(1, "QA", 40000));
        comparableExamples.add(new ComparableExample(1, "Analyst", 45000));
        comparableExamples.add(new ComparableExample(2, "Manager", 80000));
        comparableExamples.sort(null);
        for (ComparableExample j : comparableExamples) {
            System.out.println(j);
        }
    }
}