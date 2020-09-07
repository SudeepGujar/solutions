package leetcode.sept2020;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/554/week-1-september-1st-september-7th/3451/
 *
 *   Word Pattern
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 * Example 1:
 *
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 *
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 *
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 *
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
 */

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();
        if(pattern.length() != words.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            String word = map.getOrDefault(pattern.charAt(i), words[i]);
            Character patternChar = reverseMap.getOrDefault(words[i], pattern.charAt(i));
            if (!word.equals(words[i])){
                return false;
            }
            if(!patternChar.equals(pattern.charAt(i))){
                return false;
            }
            map.put(pattern.charAt(i), words[i]);
            reverseMap.put(words[i], pattern.charAt(i));
        }
        return true;
    }

}
