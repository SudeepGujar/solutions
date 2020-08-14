package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    private final LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void example1(){
        assertEquals(7, longestPalindrome.longestPalindrome("abccccdd"));
    }

    @Test
    void example2(){
        assertEquals(0, longestPalindrome.longestPalindrome(""));
    }

    @Test
    void example3(){
        assertEquals(1, longestPalindrome.longestPalindrome("aA"));
    }

    @Test
    void example4(){
        assertEquals(2, longestPalindrome.longestPalindrome("bb"));
    }

    @Test
    void example5(){
        assertEquals(3, longestPalindrome.longestPalindrome("ccc"));
    }

}