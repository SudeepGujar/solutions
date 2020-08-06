package leetcode.aug2020;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/
 * <p>
 * Find All Duplicates in an Array
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * <p>
 * Find all the elements that appear twice in this array.
 * <p>
 * Could you do it without extra space and in O(n) runtime?
 * <p>
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * Output:
 * [2,3]
 */

public class DuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
        final Set<Integer> numbers = new HashSet<>();
        return Arrays.stream(nums)
                .boxed()
                .filter(value -> {
                    if (!numbers.contains(value)) {
                        numbers.add(value);
                        return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());

    }
}
