import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = text.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        for (String w : uniqueWords) {
            System.out.println(w);
        }

        List<String> sorted = new ArrayList<>(uniqueWords);

        Collections.sort(sorted);

        for (String s : sorted) {
            System.out.println(s);
        }
    }
}