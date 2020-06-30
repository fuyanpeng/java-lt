package twosum;

import static org.junit.Assert.*;

public class TwoSumTest {

    @org.junit.Test
    public void twoSum() {
        int [] nums1 = {3, 3, 5, 7};
        assertEquals(0, TwoSum.twoSum(nums1, 6)[0]);
        assertEquals(1, TwoSum.twoSum(nums1, 6)[1]);
        int [] nums2 = {2, 5, 7, 11};
        assertEquals(0, TwoSum.twoSum(nums2, 9)[0]);
        assertEquals(2, TwoSum.twoSum(nums2, 9)[1]);
    }
}