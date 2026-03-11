import java.util.*;

class WrapperDemo {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        int c = a + b;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        System.out.println(sum);

        Double d1 = 25.5;
        Double d2 = 10.5;
        Double d3 = d1 + d2;

        System.out.println(d3);

        String s = "123";
        Integer parsed = Integer.parseInt(s);
        System.out.println(parsed + 10);

        List<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.75);
        prices.add(15.25);

        double total = 0;
        for (Double price : prices) {
            total += price;
        }

        System.out.println(total);
    }
}