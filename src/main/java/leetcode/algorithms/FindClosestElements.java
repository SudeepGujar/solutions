package leetcode.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindClosestElements {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((i1, i2) -> {
                    final int o1 = i1 - x;
                    final int o2 = i2 - x;
                    final int o1Square = o1 * o1;
                    final int o2Square = o2 * o2;
                    return o1Square - o2Square;
                })
                .limit(k)
                .sorted()
                .collect(Collectors.toList());
    }
}
