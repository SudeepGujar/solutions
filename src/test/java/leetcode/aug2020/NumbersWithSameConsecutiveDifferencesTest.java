package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithSameConsecutiveDifferencesTest {

    private final NumbersWithSameConsecutiveDifferences numbersWithSameConsecutiveDifferences = new NumbersWithSameConsecutiveDifferences();

    @Test
    void example1(){
        int[] result = {181,292,707,818,929};
        assertArrayEquals(result, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(3, 7));
    }

    @Test
    void example2(){
        int[] result = {10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98};
        assertArrayEquals(result, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(2, 1));
    }

    @Test
    void example3(){
        int[] result = {0,1,2,3,4,5,6,7,8,9};
        assertArrayEquals(result, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(1, 0));
    }

    @Test
    void example4(){
        int[] result = {11,22,33,44,55,66,77,88,99};
        assertArrayEquals(result, numbersWithSameConsecutiveDifferences.numsSameConsecDiff(2, 0));
    }

}