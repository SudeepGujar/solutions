package hackerrank.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinMaxTest {
    private final MinMax minMax= new MinMax();
    @Test
    void example1() {
        int[] arr = {
                10,
                100,
                300,
                200,
                1000,
                20,
                30};
        assertEquals(20, minMax.maxMin(3, arr));
    }


    @Test
    void example2() {
        int[] arr = {1,
                2,
                3,
                4,
                10,
                20,
                30,
                40,
                100,
                200};
        assertEquals(3, minMax.maxMin(4, arr));
    }

    @Test
    void example3() {
        int[] arr = {1,
                2,
                1,
                2,
                1};
        assertEquals(0, minMax.maxMin(2, arr));
    }

    @Test
    void example4() {
        int[] arr = {1,
                20,
                12,
                21,
                15};
        assertEquals(1, minMax.maxMin(2, arr));
    }

}