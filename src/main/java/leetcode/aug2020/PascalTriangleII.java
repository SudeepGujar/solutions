package leetcode.aug2020;

import java.util.Arrays;
import java.util.List;

/**
 *
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3421/
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 *
 */
public class PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        final int half = (rowIndex / 2) + 1;
        final int size = rowIndex + 1;
        final Integer[] result = new Integer[size];
        result[0] = 1;
        result[size -1] = 1;
        for (int i = 1; i < half; i++) {
            final Long l = (result[i - 1] * (long) (size - i)) / i;
            final Integer value =  l.intValue();
            result[i] = value;
            result[size - i -1] = value;
        }
        return Arrays.asList(result);
    }
}
