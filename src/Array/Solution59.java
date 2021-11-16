package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution59.java
 * @Description 螺旋矩阵2
 * @createTime 2021年11月02日 20:21:00
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        //设置循环圈数
        int loop = n / 2;
        //设置矩阵中心值,n为奇数时有矩阵的中心值
        int mid = n / 2;
        //设置每圈的每段循环长度(这是一个偏移量)
        int offset = 1;
        //设置每次循环的起点，其实也就是每个循环正方形的左上角
        int startRow = 0;
        int startCol = 0;
        //设置每圈的行和列的循环变量，i是行变量，而j是列变量
        int i;
        int j;
        //每次该赋的值
        int count = 1;
        while(loop > 0){
            i = startRow;
            j = startCol;
            //从左到右
            for(;j < n+startCol-offset;j++) res[i][j] = count++;
            //从上到下
            for(;i < n+startRow-offset;i++) res[i][j] = count++;
            //从右到左
            for(;j > startCol;j--) res[i][j] = count++;
            //从下到上
            for(;i > startRow;i--) res[i][j] = count++;

            loop--;
            startCol++;
            startRow++;
            offset += 2;
        }
        if(n%2 == 1){
            res[mid][mid] = count;
        }
        return res;
    }
}
