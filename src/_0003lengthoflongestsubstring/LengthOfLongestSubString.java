package _0003lengthoflongestsubstring;

import java.util.HashMap;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author fuyanpeng
 */

public class LengthOfLongestSubString {

    public static int lengthOfLongestSubString(String s) {
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
