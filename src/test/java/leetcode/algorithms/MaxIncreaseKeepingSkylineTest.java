package leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxIncreaseKeepingSkylineTest {

    MaxIncreaseKeepingSkyline maxIncreaseKeepingSkyline = new MaxIncreaseKeepingSkyline();

    @Test
    void shouldGetMaxIncreaseKeepingSkyline(){
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        assertEquals(35, maxIncreaseKeepingSkyline.maxIncreaseKeepingSkyline(grid));
    }

}