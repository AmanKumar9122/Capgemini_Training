import java.util.*;

public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        stringBuilderDemo(text);
        stringBufferDemo(text);
        performanceTest(text);
    }

    static void stringBuilderDemo(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("JAVA");
        sb.insert(2, "XX");
        sb.delete(1, 3);
        sb.replace(0, 2, "AB");
        sb.reverse();
        System.out.println(sb.toString());
    }

    static void stringBufferDemo(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.append("THREAD");
        sb.insert(1, "YY");
        sb.delete(0, 2);
        sb.replace(1, 3, "CD");
        sb.reverse();
        System.out.println(sb.toString());
    }

    static void performanceTest(String s) {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(s);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        long start2 = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sb2.append(s);
        }
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
    }
}