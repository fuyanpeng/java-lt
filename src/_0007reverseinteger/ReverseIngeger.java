package _0007reverseinteger;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 */
public class ReverseIngeger {
    public static int reverse(int x) {
        if(x>Integer.MAX_VALUE / 10 || x<Integer.MIN_VALUE / 10){
            return 0;
        }
        int res = 0;
        int tmp;
        while (x != 0){
            tmp = x % 10;
            x /= 10;
            res = res * 10 + tmp;
        }
        return res;
    }
}
