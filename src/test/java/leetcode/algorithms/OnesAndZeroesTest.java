package leetcode.algorithms;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnesAndZeroesTest {

    private final OnesAndZeroes onesAndZeroes = new OnesAndZeroes();
    @Test
    void example1() {
        final String[] arr = {"10","0001","111001","1","0"};
        final int result = onesAndZeroes.findMaxForm(arr, 5, 3);
        assertEquals(4, result);
    }

    @Test
    void example2() {
        final String[] arr = {"10","1","0"};
        final int result = onesAndZeroes.findMaxForm(arr, 1, 1);
        assertEquals(2, result);
    }

    @Test
    void example3() {
        final String[] arr = {"10","0001","111001","1","0"};
        final int result = onesAndZeroes.findMaxForm(arr, 4, 3);
        assertEquals(3, result);
    }

    @Disabled
    @Test
    void example4() {
        final String[] arr = {"111","1000","1000","1000"};
        final int result = onesAndZeroes.findMaxForm(arr, 9, 3);
        assertEquals(3, result);
    }
}