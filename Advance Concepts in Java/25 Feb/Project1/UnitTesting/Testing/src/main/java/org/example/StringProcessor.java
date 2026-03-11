package org.example;

public class StringProcessor {

    public String concatenate(String a, String b) {  // 2 usages
        if (a == null || b == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        return a + b;
    }

    public boolean isPalindrome(String str) {  // 3 usages
        if (str == null) {
            return false;
        }

        String reversed = new StringBuilder(str).reverse().toString();  // Reverse
        return str.equals(reversed);
    }
}