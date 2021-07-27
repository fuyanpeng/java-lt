package _0053maxnumssubarray;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i=1;i<length;i++){
            if (currentSum > 0){
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}