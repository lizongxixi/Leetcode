package Array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution54.java
 * @Description 螺旋矩阵
 * @createTime 2021年11月02日 20:46:00
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int n = matrix[0].length;
        int m = matrix.length;
        int startCol = 0;
        int startRow = 0;
        int j = 0;
        int i = 0;
        int offset = 1;
        int loop = m/2;
        int count = n * m;
        while(loop > 0){
            i = startRow;
            j = startCol;
            //从左到右
            for(;j < n+startCol-offset;j++) res.add(matrix[i][j]);

            //从上到下
            for(;i < m+startRow-offset;i++) res.add(matrix[i][j]);
            //从右到左
            for(;j > startCol;j--) res.add(matrix[i][j]);
            //从下到上
            for(;i > startRow;i--){
                res.add(matrix[i][j]);
                //当前循环单列的特殊情况，从上往下加之后，还会从下往上加，但是从上往下加只需再加一个就可以了
                if(res.size() == count) return res;
            }
            loop--;
            if(startCol < n-1)
            startCol++;
            if(startRow < m-1)
            startRow++;
            offset += 2;
        }
        if(m % 2 == 1){
            //循环还剩一列的特殊情况   或者是  m*m 中间的值
            i = startRow;
            j = startCol;
            for(;j <= n+startCol-offset;j++) res.add(matrix[i][j]);
        }
        return res;
    }
}
//[[1],[5],[9],[10]]
//[[1],[5],[9]]
//[[1,2,3],[4,5,6],[7,8,9]]
//[[1,2,3,4],[5,6,7,8],[9,10,11,12]]