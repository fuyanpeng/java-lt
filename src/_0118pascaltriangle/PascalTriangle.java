package _0118pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        int[][] arr = new int[numRows][numRows];
        if (numRows == 0) return res;
        for (int i = 0; i < numRows ; i++) {
            List<Integer> element = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                element.add(arr[i][j]);
            }
            res.add(element);
        }
        return res;
    }
}
