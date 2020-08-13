package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {
    private final RottingOranges rottingOranges = new RottingOranges();

    @Test
    void example1() {
        final int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        final int result = rottingOranges.orangesRotting(grid);
        assertEquals(4, result);
    }

    @Test
    void example4() {
        final int[][] grid = {{1,1,0},{0,1,1},{1,1,2}};
        final int result = rottingOranges.orangesRotting(grid);
        assertEquals(4, result);
    }

    @Test
    void example2() {
        final int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        final int result = rottingOranges.orangesRotting(grid);
        assertEquals(-1, result);
    }

    @Test
    void example3() {
        final int[][] grid = {{0,2}};
        final int result = rottingOranges.orangesRotting(grid);
        assertEquals(0, result);
    }
}