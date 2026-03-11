package Functional_Interface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AllExample {
    public static void main(String[] args) {
        List<String> names = List.of("Ram","Shyam","Mohan");
        Predicate<String> filter = name -> name.startsWith("R");
        Function<String,String> tranform = String::toUpperCase;
        Consumer<String> print = System.out::println;

        names.stream()
                .filter(filter)
                .map(tranform)
                .forEach(print);
//        System.out.println("null");
//        System.out.println(null);
    }
}
