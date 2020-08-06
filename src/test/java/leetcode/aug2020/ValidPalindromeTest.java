package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void example1() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void example2() {
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    void example3() {
        assertTrue(validPalindrome.isPalindrome(".,"));
    }

    @Test
    void example4() {
        assertTrue(validPalindrome.isPalindrome(" "));
    }

    @Test
    void example5() {
        assertTrue(validPalindrome.isPalindrome("."));
    }

    @Test
    void example6() {
        assertFalse(validPalindrome.isPalindrome("0P"));
    }
}