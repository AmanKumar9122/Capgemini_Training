import java.util.*;

class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    void setValue(T value) {
        this.value = value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Java");

        System.out.println(intBox.getValue());
        System.out.println(strBox.getValue());

        List list = new ArrayList();
        list.add(10);
        list.add("Hello");

        for (Object o : list) {
            System.out.println(o);
        }

        List<Integer> typed = new ArrayList<>();
        typed.add(1);
        typed.add(2);
        typed.add(3);

        for (Integer i : typed) {
            System.out.println(i);
        }
    }
}