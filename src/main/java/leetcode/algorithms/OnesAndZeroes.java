package leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        final int maxLength = m + n;
        final List<String> list = Arrays.stream(strs)
                .filter(s -> s.length() < maxLength)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        int ans = 0;
        final int size = list.size();
        for (int i = 0; i < size && (m > 0 || n > 0); i++) {

            final int ones = list.get(i).length() - list.get(i).replaceAll("1", "").length();
            final int zeroes =  list.get(i).length() - list.get(i).replaceAll("0", "").length();

            m = m - zeroes;
            n = n - ones;
            if(m >= 0 && n >= 0) {
                ans++;
            }
        }
        return ans;
    }
}
