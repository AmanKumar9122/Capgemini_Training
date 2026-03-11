package Functional_Interface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Manually
        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        System.out.println(function.apply(12));

        // Lambda Function
        Function<Integer,Integer> function1 = number -> number*number;
        System.out.println(function1.apply(12));
    }
}
