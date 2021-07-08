package _0010maxarea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxAreaTest {

    @Test
    public void test(){
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        assertEquals(49, MaxArea.maxArea(height));
    }
}
