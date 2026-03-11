import java.util.*;

class Buffer {
    Queue<Integer> queue = new LinkedList<>();
    int capacity = 5;

    synchronized void produce(int val) throws Exception {
        while (queue.size() == capacity) {
            wait();
        }

        queue.add(val);
        System.out.println("Produced " + val);

        notify();
    }

    synchronized void consume() throws Exception {
        while (queue.isEmpty()) {
            wait();
        }

        int val = queue.poll();
        System.out.println("Consumed " + val);

        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(200);
                } catch (Exception e) {
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(400);
                } catch (Exception e) {
                }
            }
        });

        producer.start();
        consumer.start();
    }
}