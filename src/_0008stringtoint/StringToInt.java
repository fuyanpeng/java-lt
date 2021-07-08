package _0008stringtoint;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit charcter or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 *
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 *
 */
public class StringToInt {
    public static int myaoit(String s){
        char [] chars = s.toCharArray();
        int i = 0;
        int length = chars.length;
        boolean negative = false;
        while (i<length && chars[i] == ' '){
            i++;
        }
        if (i == length) return 0;
        if (chars[i] == '+') {
            i++;
        } else if (chars[i] == '-'){
            i++;
            negative=true;
        } else if (chars[i] < '0' || chars[i] > '9') {
            return 0;
        }
        int res = 0;
        int tmp;
        while (i <length && Character.isDigit(chars[i])) {
            tmp = chars[i] - '0';
            res = res * 10 + tmp;
            if (res > Integer.MAX_VALUE / 10) {
                return negative ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            i++;
        }
        return negative ? -res:res;
    }
}
