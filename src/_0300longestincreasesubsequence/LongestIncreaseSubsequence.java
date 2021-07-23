package _0300longestincreasesubsequence;

import java.util.List;

public class LongestIncreaseSubsequence {
    public static Integer lis(int[] nums){
        int m = nums.length;
        int[] dp = new int[m];
        dp[0] = 1;
        int maxlength = 1;
        for (int i = 1; i < m; i++) {
            dp[i] = 1;
            int currentNum = nums[i];
            for (int j=0; j<i; j++){
                if (currentNum > nums[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            maxlength = Math.max(maxlength, dp[i]);
        }
        return maxlength;
    }
}
