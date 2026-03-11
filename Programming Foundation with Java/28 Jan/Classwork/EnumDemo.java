import java.util.*;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Schedule {
    private Day day;

    public Schedule(Day day) {
        this.day = day;
    }

    public void show() {
        switch (day) {
            case MONDAY:
                System.out.println("Start of work week");
                break;
            case FRIDAY:
                System.out.println("Almost weekend");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Regular day");
        }
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(Day.MONDAY);
        Schedule s2 = new Schedule(Day.FRIDAY);
        Schedule s3 = new Schedule(Day.SUNDAY);

        s1.show();
        s2.show();
        s3.show();

        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}