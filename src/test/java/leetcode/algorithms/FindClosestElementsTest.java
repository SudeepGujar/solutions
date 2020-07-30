package leetcode.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestElementsTest {

    FindClosestElements findClosestElements = new FindClosestElements();

    @Test
    void example1() {
        int[] arr = {1,2,3,4,5};
        final List<Integer> result = findClosestElements.findClosestElements(arr, 4, 3);
        assertEquals(Arrays.asList(1,2,3,4),result);
    }

    @Test
    void example2() {
        int[] arr = {1,2,3,4,5};
        final List<Integer> result = findClosestElements.findClosestElements(arr, 4, -1);
        assertEquals(Arrays.asList(1,2,3,4),result);
    }
}