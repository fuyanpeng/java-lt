package _0014longestcommonprefix;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){
        int strCount = strs.length;
        int minLength = 0;
        Boolean hasNext = true;
        StringBuilder prefix = new StringBuilder();
        while (hasNext){
            if (strs[0].length() <= minLength) break;
            String tmp = strs[0].substring(minLength, minLength+1);
            for (int i = 0; i < strCount; i++) {
                if (strs[i].length() > minLength && tmp.equals(strs[i].substring(minLength, minLength + 1))){
                    continue;
                } else {
                    hasNext = false;
                    break;
                }
            }
            minLength++;
            if(hasNext) prefix.append(tmp);
        }
        return prefix.toString();
    }
}
