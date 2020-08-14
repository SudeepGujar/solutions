package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationIteratorTest {

    @Test
    void example1(){
        CombinationIterator iterator = new CombinationIterator("abc", 2); // creates the iterator.

        assertEquals("ab", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("ac",iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("bc", iterator.next());
        assertFalse(iterator.hasNext());
    }

}