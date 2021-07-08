package _0009palindromeinteger;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 */
public class PalindromeInteger {
    public static Boolean isPalindromeNumber(Integer x){
        if (x <0 || x % 10 == 0 && x != 0) return false;
        int half = 0;
        int tmp;
        while (x > half) {
            tmp = x % 10;
            x = x / 10;
            half = half * 10 + tmp;
        }
        return half == x || half / 10 == x;
    }
}
