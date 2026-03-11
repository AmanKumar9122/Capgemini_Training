// Scenario:
// You are building a log processing system for a server.

// Each log entry is a string:
// "LEVEL:MESSAGE"
// Example: "ERROR:DiskFull"

// Rules:
// - Logs arrive in real time and must be processed in FIFO order.
// - If the log level is ERROR, it must be re-processed immediately after the current log.
// - If the same ERROR message appears 3 times consecutively, stop processing and raise an alert.
// - You must preserve original order as much as possible.

// Constraints:
// - Use only Queue, Stack, and String operations.
// - No additional data structures like Map or Set.

// Tasks:
// - Design the algorithm.
// - Explain which data structure is used at each step.
// - Analyze time and space complexity.

// Follow-up :
// - How would you modify the solution if logs arrive from multiple producers?

import java.util.*;
public class LogProcessing {
    public static void processLogs(Queue<String> logsQueue) {
        Deque<String> errorStack = new ArrayDeque<>();
        String lastErrorMessage = null;
        int errorCount = 0;
        while (!logsQueue.isEmpty() || !errorStack.isEmpty()) {
            String log;
            boolean fromStack = false;
            if (!errorStack.isEmpty()) {
                log = errorStack.pop();
                fromStack = true;
            } else {
                log = logsQueue.poll();
            }
            System.out.println("Processing: " + log);
            String[] parts = log.split(":", 2);
            String level = parts[0];
            String message = parts[1];
            if (level.equals("ERROR")) {
                if (!fromStack) {
                    errorStack.push(log);
                }
                if (message.equals(lastErrorMessage)) {
                    errorCount++;
                } else {
                    lastErrorMessage = message;
                    errorCount = 1;
                }
                if (errorCount == 3) {
                    System.out.println("ALERT: ERROR '" + message + "' occurred 3 times consecutively");
                    return;
                }
            } else {
                lastErrorMessage = null;
                errorCount = 0;
            }
        }
    }
    public static void main(String[] args) {
        Queue<String> logs = new LinkedList<>();
        logs.add("INFO:Start");
        logs.add("ERROR:DiskFull");
        logs.add("INFO:Processing");
        logs.add("ERROR:DiskFull");
        logs.add("ERROR:DiskFull");
        logs.add("ERROR:DiskFull");
        logs.add("INFO:End");
        processLogs(logs);
    }
}

// Follow-up solution for multiple producers:
// We can use a thread-safe queue like ConcurrentLinkedQueue to handle logs from multiple producers.


