package leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinFibonacciNumbersTest {
    private final MinFibonacciNumbers minFibonacciNumbers = new MinFibonacciNumbers();

    @Test
    void example1(){
        int result = this.minFibonacciNumbers.findMinFibonacciNumbers(7);
        assertEquals(2, result);
    }

    @Test
    void example2(){
        int result = this.minFibonacciNumbers.findMinFibonacciNumbers(10);
        assertEquals(2, result);
    }

    @Test
    void example3(){
        int result = this.minFibonacciNumbers.findMinFibonacciNumbers(19);
        assertEquals(3, result);
    }

}