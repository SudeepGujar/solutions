package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleIITest {
    private final PascalTriangleII pascalTriangleII = new PascalTriangleII();

    @Test
    void example1() {
        final List<Integer> result = pascalTriangleII.getRow(3);
        assertEquals(Arrays.asList(1,3,3,1),result);
    }

    @Test
    void example2() {
        final List<Integer> result = pascalTriangleII.getRow(1);
        assertEquals(Arrays.asList(1,1),result);
    }

    @Test
    void example3() {
        final List<Integer> result = pascalTriangleII.getRow(2);
        assertEquals(Arrays.asList(1,2,1),result);
    }

    @Test
    void example4() {
        final List<Integer> result = pascalTriangleII.getRow(4);
        assertEquals(Arrays.asList(1,4,6,4,1),result);
    }

    @Test
    void example5() {
        final List<Integer> result = pascalTriangleII.getRow(0);
        assertEquals(Arrays.asList(1),result);
    }

    @Test
    void example6() {
        final List<Integer> result = pascalTriangleII.getRow(5);
        assertEquals(Arrays.asList(1, 5, 10, 10, 5, 1),result);
    }

    @Test
    void example7() {
        final List<Integer> result = pascalTriangleII.getRow(30);
        assertEquals(Arrays.asList(1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1),result);
    }

}