package leetcode.aug2020;


/**
 *
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3411/
 *
 *   Valid Palindrome
 *
 * Solution
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 *
 *
 * Constraints:
 *
 * s consists only of printable ASCII characters.
 *
 */

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if(s.trim().length()<2){
            return true;
        }
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            final char startChar = s.charAt(start);
            if(!Character.isLetterOrDigit(startChar)){
                 start++;
                 continue;
             }
            final char endChar = s.charAt(end);
            if(!Character.isLetterOrDigit(endChar)){
                end--;
                continue;
            }
            if(Character.toLowerCase(startChar) != Character.toLowerCase(endChar)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }


}
