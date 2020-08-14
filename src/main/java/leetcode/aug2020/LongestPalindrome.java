package leetcode.aug2020;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3423/
 * <p>
 * Longest Palindrome
 * <p>
 * <p>
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * <p>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * <p>
 * Example:
 * <p>
 * Input:
 * "abccccdd"
 * <p>
 * Output:
 * 7
 * <p>
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Long> map = s.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()));

        Long count = map.entrySet().stream()
                .mapToLong(e -> e.getValue() % 2 == 0 ? e.getValue() : e.getValue() -1)
                .sum();

        return s.length() > count ? count.intValue() + 1 : count.intValue();
    }
}
