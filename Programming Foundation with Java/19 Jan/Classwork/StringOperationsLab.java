import java.util.*;

public class StringOperationsLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        displayLength(input);
        displayCharacters(input);
        reverseString(input);
        countVowels(input);
        countConsonants(input);
        convertUpper(input);
        convertLower(input);
        checkPalindrome(input);
        splitWords(input);
        replaceSpaces(input);
    }

    static void displayLength(String s) {
        System.out.println(s.length());
    }

    static void displayCharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    static void reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }

    static void countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    static void countConsonants(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z') {
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void convertUpper(String s) {
        System.out.println(s.toUpperCase());
    }

    static void convertLower(String s) {
        System.out.println(s.toLowerCase());
    }

    static void checkPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        System.out.println(s.equals(rev));
    }

    static void splitWords(String s) {
        String[] arr = s.split(" ");
        for (String word : arr) {
            System.out.println(word);
        }
    }

    static void replaceSpaces(String s) {
        System.out.println(s.replace(" ", "_"));
    }
}