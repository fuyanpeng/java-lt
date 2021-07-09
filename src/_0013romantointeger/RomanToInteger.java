package _0013romantointeger;

public class RomanToInteger {

    public static int convertRoman(String s){

        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int res = 0;
        for (int i = romans.length-1; i >= 0 ; i--) {
            while (s.startsWith(romans[i])){
                int length = s.length();
                s = s.substring(romans[i].length(), length);
                res += values[i];
            }
        }
        return res;
    }
}
