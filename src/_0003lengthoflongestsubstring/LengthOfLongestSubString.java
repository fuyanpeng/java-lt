package _0003lengthoflongestsubstring;

import java.util.HashMap;

public class LengthOfLongestSubString {

    public static int longthOfLongestSubString(String s) {
        int maxCount = 0;
        int cursorCount;
        int leftIndex = -1;
        HashMap<String, Integer> strMap = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            String strSub = s.substring(i, i+1);
            if (strMap.containsKey(strSub)) {
                leftIndex = leftIndex > strMap.get(strSub) ? leftIndex:strMap.get(strSub);
            }
            strMap.put(strSub, i);
            cursorCount = i - leftIndex;
            maxCount = maxCount > cursorCount? maxCount:cursorCount;

        }
        return maxCount;
    }
}
