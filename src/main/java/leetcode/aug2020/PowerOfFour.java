package leetcode.aug2020;

import java.util.BitSet;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3412/
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 *
 * Example 2:
 *
 * Input: 5
 * Output: false
 *
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        return num !=0 && (num & (num-1)) == 0 &&(num & 0xAAAAAAAA) == 0;
    }
}
