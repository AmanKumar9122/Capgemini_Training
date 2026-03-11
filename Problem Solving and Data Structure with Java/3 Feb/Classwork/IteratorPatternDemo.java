import java.util.*;

class NameRepository implements Iterable<String> {
    private String[] names = { "Aman", "Rahul", "Neha", "Karan" };

    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index;

        public boolean hasNext() {
            return index < names.length;
        }

        public String next() {
            return names[index++];
        }
    }
}

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();

        for (String name : repo) {
            System.out.println(name);
        }
    }
}