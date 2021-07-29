package _0119pascaltriangletwo;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> cur = new ArrayList<Integer>();
            for (int j = 0; j < i+1; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return pre;
    }
}