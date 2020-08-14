package leetcode.aug2020;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfFourTest {
    private final PowerOfFour powerOfFour = new PowerOfFour();

    @Test
    void example1() {
        assertTrue(powerOfFour.isPowerOfFour(16));
    }

    @Test
    void example2() {
        assertFalse(powerOfFour.isPowerOfFour(5));
    }

    @Test
    void example3() {
        assertFalse(powerOfFour.isPowerOfFour(0));
    }

    @Test
    void example4() {
        assertTrue(powerOfFour.isPowerOfFour(1));
    }

    @Test
    void example5() {
        assertFalse(powerOfFour.isPowerOfFour(2));
    }

    @Test
    void example6() {
        assertFalse(powerOfFour.isPowerOfFour(9));
    }
}