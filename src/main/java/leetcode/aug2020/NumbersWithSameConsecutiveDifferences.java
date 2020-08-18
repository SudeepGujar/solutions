package leetcode.aug2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> result = new ArrayList<>();
        if(n==1){
            result.add(0);
        }
        for (int i = 1; i < 10; i++) {
            result.addAll(getNumber(i, n-1, k));
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

        if(k==0){
            result.addAll(getNumber((number * 10) + lastDigit, n-1, k));
            return result;
        }
        if(lastDigit-k>=0) {
            result.addAll(getNumber((number * 10) + lastDigit - k, n - 1, k));
        }
        if(lastDigit + k < 10) {
            result.addAll(getNumber((number * 10) + lastDigit + k, n - 1, k));
        }

        return result;
    }
}
