package _0015threesum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumTest {
    @Test
    public void  test(){
        int[] nums = new int[] {1,0,-1,-1};
        Integer[] rs = new Integer[] {-1,0,1};
        assertEquals(rs, ThreeSum.threeSum(nums));
    }
}
