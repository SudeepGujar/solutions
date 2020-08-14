package leetcode.aug2020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3422/
 * <p>
 * Iterator for Combination
 * <p>
 * Design an Iterator class, which has:
 * <p>
 * A constructor that takes a string characters of sorted distinct lowercase English letters and a number combinationLength as arguments.
 * A function next() that returns the next combination of length combinationLength in lexicographical order.
 * A function hasNext() that returns True if and only if there exists a next combination.
 * <p>
 * <p>
 * Example:
 * <p>
 * CombinationIterator iterator = new CombinationIterator("abc", 2); // creates the iterator.
 * <p>
 * iterator.next(); // returns "ab"
 * iterator.hasNext(); // returns true
 * iterator.next(); // returns "ac"
 * iterator.hasNext(); // returns true
 * iterator.next(); // returns "bc"
 * iterator.hasNext(); // returns false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= combinationLength <= characters.length <= 15
 * There will be at most 10^4 function calls per test.
 * It's guaranteed that all calls of the function next are valid.
 */

public class CombinationIterator {

    private final Iterator<String> iterator;

    public CombinationIterator(String characters, int combinationLength) {
        List<String> combinations = getCombinations(characters, combinationLength);
        iterator = combinations.iterator();

    }

    private List<String> getCombinations(String characters, int combinationLength) {
        if (combinationLength == 1) {
            return characters.chars().mapToObj(value -> (char) value + "").collect(Collectors.toList());
        }
        String substring = characters.substring(1);
        List<String> combinations = getCombinations(substring, combinationLength - 1)
                .stream()
                .map(s -> characters.charAt(0) + s)
                .collect(Collectors.toCollection(ArrayList::new));
        if (substring.length() >= combinationLength) {
            combinations.addAll(getCombinations(substring, combinationLength));
        }
        return combinations;


    }

    public String next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
