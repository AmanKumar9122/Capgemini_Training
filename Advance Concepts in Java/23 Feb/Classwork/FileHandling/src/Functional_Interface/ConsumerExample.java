package Functional_Interface;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Manually
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("Consumer Inner Class");
//        Consumer<Integer> consumer1 = number ->{
//            System.out.println(number);
//        };

        // Lambda Function
        Consumer<Integer> consumer1 = System.out::println;
        consumer1.accept(20);
    }
}
