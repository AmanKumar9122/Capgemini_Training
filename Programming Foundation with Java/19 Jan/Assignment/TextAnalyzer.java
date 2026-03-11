import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        countWords(text);
        longestWord(text);
        shortestWord(text);
        frequency(text);
        removeDuplicates(text);
    }

    static void countWords(String text) {
        String[] arr = text.trim().split("\\s+");
        System.out.println(arr.length);
    }

    static void longestWord(String text) {
        String[] arr = text.split(" ");
        String longest = "";
        for (String word : arr) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }

    static void shortestWord(String text) {
        String[] arr = text.split(" ");
        String shortest = arr[0];
        for (String word : arr) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        System.out.println(shortest);
    }

    static void frequency(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : map.keySet()) {
            System.out.println(c + " " + map.get(c));
        }
    }

    static void removeDuplicates(String text) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                set.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}