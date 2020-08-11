package leetcode.aug2020;


/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3419/
 * <p>
 * Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 * <p>
 * Input: "A"
 * Output: 1
 * Example 2:
 * <p>
 * Input: "AB"
 * Output: 28
 * Example 3:
 * <p>
 * Input: "ZY"
 * Output: 701
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 7
 * s consists only of uppercase English letters.
 * s is between "A" and "FXSHRXW".
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        int multiplier = 1;
        int result = 0;
        final int lastIndex = s.length() -1 ;
        for (int i = 0; i <= lastIndex; i++) {
            multiplier = i ==0 ? 1 : multiplier * 26;
            result += (s.charAt(lastIndex - i) - 'A' + 1) * multiplier;
        }
        return result;
    }
}

