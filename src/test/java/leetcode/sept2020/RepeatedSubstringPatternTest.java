package leetcode.sept2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {
    private final RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();

    @Test
    void example1(){
        boolean result = repeatedSubstringPattern.isRepeatedSubstringPattern("abab");
        assertTrue(result);
    }

    @Test
    void example2(){
        boolean result = repeatedSubstringPattern.isRepeatedSubstringPattern("aba");
        assertFalse(result);
    }

    @Test
    void example3(){
        boolean result = repeatedSubstringPattern.isRepeatedSubstringPattern("ababab");
        assertTrue(result);
    }

    @Test
    void example4(){
        boolean result = repeatedSubstringPattern.isRepeatedSubstringPattern("abababab");
        assertTrue(result);
    }

}