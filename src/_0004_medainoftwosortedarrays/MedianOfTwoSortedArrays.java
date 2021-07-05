package _0004_medainoftwosortedarrays;


/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Example 3:
 *
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * Example 4:
 *
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * Example 5:
 *
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 *
 */
public class MedianOfTwoSortedArrays {

    public static Double solution(int [] nums1, int [] nums2){
        int m = nums1.length;
        int n = nums2.length;
        if (m==0 && n==0){
            return 0.0;
        }else if (m==0) {
            if (n % 2 == 0) {
                return (nums2[n/2] + nums2[n/2 - 1])/2.0;
            } else {
                return nums2[n/2] * 1.0;
            }
        }else if (n==0) {
            if (m % 2 == 0){
                return (nums1[m/2] + nums1[m/2 -1])/2.0;
            } else {
                return nums1[m/2] * 1.0;
            }
        }
        int countA = 0;
        int countB = 0;
        int valueMin = 0;
        int valueMin2 = 0;
        int j = 0;
        while (j <= (m+n)/2){
            if(countA>=m && countB<n) {
                valueMin2 = valueMin;
                valueMin = nums2[countB];
                j++;
                countB++;
            } else if (countB>=n && countA<m) {
                valueMin2 = valueMin;
                valueMin = nums1[countA];
                j++;
                countA++;
            }else if (nums1[countA] <= nums2[countB]){
                valueMin2 = valueMin;
                valueMin = nums1[countA];
                j++;
                countA++;
            } else {
                valueMin2 = valueMin;
                valueMin = nums2[countB];
                j++;
                countB++;
            }
        }
        if ((m + n) % 2 == 0) {
            return (valueMin + valueMin2)/2.0;
        } else {
            return valueMin * 1.0;
        }
    }
}
