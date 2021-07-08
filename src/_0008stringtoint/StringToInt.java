package _0008stringtoint;

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
