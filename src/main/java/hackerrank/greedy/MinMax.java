package hackerrank.greedy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/angry-children/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 *
 */
public class MinMax {

    public int maxMin(int k, int[] arr) {

        Arrays.sort(arr);

        int length = arr.length;
        int min= arr[length-1];
        for (int i = k-1; i < length; i++) {
            int diff = arr[i] - arr[i - k + 1];
            min = Math.min(min, diff);
        }
        return min;
    }

}
