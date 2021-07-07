package _0005longespalindrome;

/**
 * Given a string s, return the longest palindromic substring in s.
 *
 *  
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 *
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int length = s.length();
        int subLength = s.length();
        if(s.length()<2)return s;
        String sub = s.substring(0,1);
        while (subLength >=2) {
            for (int left=0; left+subLength<=length; left++){
                if(this.isRomeStr(s.substring(left,left+subLength))){
                    return s.substring(left,left+subLength);
                }
            }
            subLength--;
        }
        return sub;
    }

    private Boolean isRomeStr(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
