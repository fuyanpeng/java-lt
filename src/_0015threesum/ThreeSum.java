package _0015threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int length = nums.length;
        if (length < 3){
            return res;
        }
        for (int i=0; i<length-1; i++) {
            if (nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = length -1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if ( sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
