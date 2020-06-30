package twosum;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */

public class TwoSum {

    public static int [] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> keyMap = new HashMap<>();
        int [] rs = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if(keyMap.containsKey(value)) {
                rs[0] = keyMap.get(value);
                rs[1] = i;
                break;
            }else {
                keyMap.put(nums[i], i);
            }
        }
        return rs;
    }
}
