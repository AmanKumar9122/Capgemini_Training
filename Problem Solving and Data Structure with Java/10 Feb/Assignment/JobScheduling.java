import java.util.*;

class Job {
    int id;
    int deadline;
    int profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void main(String[] args) {

        List<Job> jobs = new ArrayList<>();

        jobs.add(new Job(1, 2, 100));
        jobs.add(new Job(2, 1, 19));
        jobs.add(new Job(3, 2, 27));
        jobs.add(new Job(4, 1, 25));
        jobs.add(new Job(5, 3, 15));

        jobs.sort((a, b) -> b.profit - a.profit);

        int maxDeadline = 0;

        for (Job j : jobs) {
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int profit = 0;

        for (Job j : jobs) {
            for (int d = j.deadline; d > 0; d--) {
                if (slot[d] == -1) {
                    slot[d] = j.id;
                    profit += j.profit;
                    break;
                }
            }
        }

        for (int i = 1; i < slot.length; i++) {
            if (slot[i] != -1) {
                System.out.println(slot[i]);
            }
        }

        System.out.println(profit);
    }
}