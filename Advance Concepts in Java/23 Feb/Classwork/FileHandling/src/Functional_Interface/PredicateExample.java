package Functional_Interface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // manually
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 11;
            }
        };
        System.out.println(predicate.test(10));

        // using lambda function
        Predicate<Integer> predicate1 = number -> number >= 11;
        System.out.println(predicate1.test(10));
    }
}
