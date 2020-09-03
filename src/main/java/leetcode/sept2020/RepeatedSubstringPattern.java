package leetcode.sept2020;

public class RepeatedSubstringPattern {
    public boolean isRepeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(0) && checkIfRepeated(s, i)){
                return true;
            }
        }
        return false;
    }

    private boolean checkIfRepeated(String s, int i) {
        int length = s.length();
        if(length % i != 0){
            return false;
        }
        String pattern = s.substring(0, i);
        for (int j = 0; j < length; j+=i) {
            if(!pattern.equals(s.substring(j, j+i))){
                return false;
            }
        }
        return true;
    }
}
