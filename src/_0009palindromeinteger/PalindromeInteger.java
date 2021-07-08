package _0009palindromeinteger;

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
