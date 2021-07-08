package _0010maxarea;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
 *
 * Notice that you may not slant the container.
 *
 */
public class MaxArea {
    public static int maxArea(int [] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            res = height[i] < height[j] ? Math.max((j-i) * height[i++], res): Math.max((j-i) * height[j--], res);
        }
        return res;
    }
}
