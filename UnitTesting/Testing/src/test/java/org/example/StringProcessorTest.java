package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringProcessorTest {
    StringProcessor processor = new StringProcessor();

    @Test
    public void testConcatenateNormal() {
        String result = processor.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    public void testConcatenateEmptyStrings() {
        String result = processor.concatenate("", "");
        assertEquals("", result);
    }

    @Test
    public void testConcatenateFirstNull() {
        assertThrows(IllegalArgumentException.class,
                () -> processor.concatenate(null, "World"));
    }

    @Test
    public void testConcatenateSecondNull() {
        assertThrows(IllegalArgumentException.class,
                () -> processor.concatenate("Hello", null));
    }

    @Test
    public void testPalindromeTrue() {
        assertTrue(processor.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeFalse() {
        assertFalse(processor.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeSingleCharacter() {
        assertTrue(processor.isPalindrome("a"));
    }

    @Test
    public void testPalindromeEmptyString() {
        assertTrue(processor.isPalindrome(""));
    }

    @Test
    public void testPalindromeNull() {
        assertFalse(processor.isPalindrome(null));
    }
}