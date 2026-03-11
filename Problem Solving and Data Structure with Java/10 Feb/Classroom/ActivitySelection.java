import java.util.*;

class Activity {
    int start;
    int finish;

    Activity(int s, int f) {
        start = s;
        finish = f;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity(1, 4));
        activities.add(new Activity(3, 5));
        activities.add(new Activity(0, 6));
        activities.add(new Activity(5, 7));
        activities.add(new Activity(8, 9));
        activities.add(new Activity(5, 9));

        activities.sort((a, b) -> a.finish - b.finish);

        int count = 0;
        int lastFinish = -1;

        for (Activity a : activities) {
            if (a.start >= lastFinish) {
                System.out.println(a.start + " " + a.finish);
                lastFinish = a.finish;
                count++;
            }
        }

        System.out.println(count);
    }
}