package leetcode.aug2020;

import java.util.List;

public class GoatLatin {

    public static final List<Character> VOWELS = List.of('a', 'e', 'i', 'o', 'u');

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String append = "a";
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);
            if(!VOWELS.contains(Character.toLowerCase(firstChar))){
                word = word.substring(1) + firstChar;
            }
            result = result + " " +word + "ma" +append;
            append = append + "a";
        }
        return result.trim();
    }
}
