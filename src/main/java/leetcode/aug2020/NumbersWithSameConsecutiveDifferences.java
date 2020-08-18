package leetcode.aug2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/551/week-3-august-15th-august-21st/3428/
 * <p>
 * Numbers With Same Consecutive Differences
 * <p>
 * Solution
 * Return all non-negative integers of length N such that the absolute difference between every two consecutive digits is K.
 * <p>
 * Note that every number in the answer must not have leading zeros except for the number 0 itself. For example, 01 has one leading zero and is invalid, but 0 is valid.
 * <p>
 * You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: N = 3, K = 7
 * Output: [181,292,707,818,929]
 * Explanation: Note that 070 is not a valid number, because it has leading zeroes.
 * Example 2:
 * <p>
 * Input: N = 2, K = 1
 * Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= N <= 9
 * 0 <= K <= 9
 */
public class NumbersWithSameConsecutiveDifferences {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
        }
        for (int i = 1; i < 10; i++) {
            result.addAll(getNumber(i, n - 1, k));
        }
        int size = result.size();
        int[] resultArray = new int[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    private List<Integer> getNumber(int number, int n, int k) {
        if (n == 0) {
            return Collections.singletonList(number);
        }
        int lastDigit = number % 10;
        List<Integer> result = new ArrayList<>();

        if (k == 0) {
            result.addAll(getNumber((number * 10) + lastDigit, n - 1, k));
            return result;
        }
        if (lastDigit - k >= 0) {
            result.addAll(getNumber((number * 10) + lastDigit - k, n - 1, k));
        }
        if (lastDigit + k < 10) {
            result.addAll(getNumber((number * 10) + lastDigit + k, n - 1, k));
        }

        return result;
    }
}
