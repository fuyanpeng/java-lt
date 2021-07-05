package _0004_medainoftwosortedarrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void test(){
        int[] arraysA = new int[] {1,3};
        int[] arraysB = new int[] {2};

        assertEquals(java.util.Optional.of(2.0), java.util.Optional.of(MedianOfTwoSortedArrays.solution(arraysA,arraysB)));

        int[] arraysC = new int[] {};
        int[] arraysD = new int[] {1,2,3,4};

        assertEquals(java.util.Optional.of(2.5), java.util.Optional.of(MedianOfTwoSortedArrays.solution(arraysC,arraysD)));


        int[] arraysE = new int[] {0,0};
        int[] arraysF = new int[] {0,0};

        assertEquals(java.util.Optional.of(0.0), java.util.Optional.of(MedianOfTwoSortedArrays.solution(arraysE,arraysF)));


        int[] arrays1 = new int[] {1};
        int[] arrays2 = new int[] {0};

        assertEquals(java.util.Optional.of(0.5), java.util.Optional.of(MedianOfTwoSortedArrays.solution(arrays1,arrays2)));

    }
}
