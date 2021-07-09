package _0012integertoroman;


public class IntegerToRoman {
    public static String convert(int num) {
        StringBuilder sb = new StringBuilder();
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for(int i=romans.length - 1; i>=0; i--){
            while (num >= values[i]){
                num-=values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
}
