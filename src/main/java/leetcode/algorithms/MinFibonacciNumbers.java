package leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
 *
 * 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
 * Medium
 *
 * 238
 *
 * 30
 *
 * Add to List
 *
 * Share
 * Given the number k, return the minimum number of Fibonacci numbers whose sum is equal to k, whether a Fibonacci number could be used multiple times.
 *
 * The Fibonacci numbers are defined as:
 *
 * F1 = 1
 * F2 = 1
 * Fn = Fn-1 + Fn-2 , for n > 2.
 * It is guaranteed that for the given constraints we can always find such fibonacci numbers that sum k.
 *
 *
 * Example 1:
 *
 * Input: k = 7
 * Output: 2
 * Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ...
 * For k = 7 we can use 2 + 5 = 7.
 * Example 2:
 *
 * Input: k = 10
 * Output: 2
 * Explanation: For k = 10 we can use 2 + 8 = 10.
 * Example 3:
 *
 * Input: k = 19
 * Output: 3
 * Explanation: For k = 19 we can use 1 + 5 + 13 = 19.
 *
 *
 * Constraints:
 *
 * 1 <= k <= 10^9
 */
public class MinFibonacciNumbers {

    public int findMinFibonacciNumbers(int k) {
        final List<Integer> fibo = getFibo(k);
        int i = fibo.size() -1;
        int result = 0;
        while(k>0){
            if(k-fibo.get(i) >= 0 ){
                k-=fibo.get(i);
                result++;
            }
            if(i>0){
                i--;
            }
        }
        return result;
    }

    private List<Integer> getFibo(int k) {
        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);

        int lastIndex = 1;
        do {
            lastIndex++;
            fibo.add(fibo.get(lastIndex-1) + fibo.get(lastIndex-2));
        }while (fibo.get(lastIndex)< k);
        return fibo;
    }
}
