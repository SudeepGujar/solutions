package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCandiesTest {

    private final DistributeCandies distributeCandies = new DistributeCandies();

    @Test
    void example1(){
        int[] result = distributeCandies.distributeCandies(7, 4);
        assertArrayEquals(new int[]{1,2,3,1}, result);
    }

    @Test
    void example2(){
        int[] result = distributeCandies.distributeCandies(10, 3);
        assertArrayEquals(new int[]{5,2,3}, result);
    }
}