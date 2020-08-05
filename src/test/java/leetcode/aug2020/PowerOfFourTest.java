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
}