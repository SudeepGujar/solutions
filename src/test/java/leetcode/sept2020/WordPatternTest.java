package leetcode.sept2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    private final WordPattern wordPattern = new WordPattern();

    @Test
    void example1() {
        boolean result = wordPattern.wordPattern("abba", "dog cat cat dog");
        assertTrue(result);
    }

    @Test
    void example2() {
        boolean result = wordPattern.wordPattern("abba", "dog cat cat fish");
        assertFalse(result);
    }


    @Test
    void example3() {
        boolean result = wordPattern.wordPattern("aaaa", "dog cat cat dog");
        assertFalse(result);
    }

    @Test
    void example4() {
        boolean result = wordPattern.wordPattern("abba", "dog dog dog dog");
        assertFalse(result);
    }

    @Test
    void example5() {
        boolean result = wordPattern.wordPattern("aaaa", "dog dog dog dog dog");
        assertFalse(result);
    }
}