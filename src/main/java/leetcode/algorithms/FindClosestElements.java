package leetcode.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a sorted array arr, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4,5], k = 4, x = 3
 * Output: [1,2,3,4]
 * Example 2:
 *
 * Input: arr = [1,2,3,4,5], k = 4, x = -1
 * Output: [1,2,3,4]
 *
 *
 * Constraints:
 *
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 10^4
 * Absolute value of elements in the array and x will not exceed 104
 */


public class FindClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(i -> Math.abs(i - x)))
                .limit(k)
                .sorted()
                .collect(Collectors.toList());
    }
}
