package _0016threesumclosest;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int length = nums.length;
        if (length < 3) return 0;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < length-1 ; i++) {
            int left = i+1;
            int right = length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) return sum;
                if (Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
                if (sum > target){
                    right--;
                } else {
                    left++;
                }
            }

        }
        return res;
    }
}
