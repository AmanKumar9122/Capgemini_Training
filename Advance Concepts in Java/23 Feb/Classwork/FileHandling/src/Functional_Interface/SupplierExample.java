package Functional_Interface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // manually
        Supplier<String> s = new Supplier<String>() {
            @Override
            public String get() {
                return "Supply Inner Class";
            }
        };
        System.out.println(s.get());

        // Lambda Expression
        Supplier<String> s1 = () -> "Supplier Lambda";
        System.out.println(s1.get());
    }
}
