import java.util.*;

public class LogProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> logs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            logs.add(sc.nextLine());
        }
        filterErrors(logs);
        extractUsers(logs);
        countLevels(logs);
        rebuildLogs(logs);
    }

    static void filterErrors(List<String> logs) {
        for (String log : logs) {
            if (log.contains("ERROR")) {
                System.out.println(log);
            }
        }
    }

    static void extractUsers(List<String> logs) {
        for (String log : logs) {
            String[] parts = log.split(" ");
            if (parts.length > 2) {
                System.out.println(parts[2]);
            }
        }
    }

    static void countLevels(List<String> logs) {
        Map<String, Integer> map = new HashMap<>();
        for (String log : logs) {
            String[] parts = log.split(" ");
            String level = parts[1];
            map.put(level, map.getOrDefault(level, 0) + 1);
        }
        for (String k : map.keySet()) {
            System.out.println(k + " " + map.get(k));
        }
    }

    static void rebuildLogs(List<String> logs) {
        StringBuilder sb = new StringBuilder();
        for (String log : logs) {
            sb.append(log).append("|");
        }
        System.out.println(sb.toString());
    }
}