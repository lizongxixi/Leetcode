package backTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution51_2.java
 * @Description TODO
 * @createTime 2022年01月04日 21:06:00
 */
public class Solution51_2 {

    List<List<String>> res = new LinkedList<>();
    private List<String> charToList(char[][] chessboard){
        List<String> path = new LinkedList<>();
        for (char[] c : chessboard){
            path.add(String.copyValueOf(c));
        }
        return path;
    }
    private boolean isValid(int n,int row,int col,char[][] chessboard){
        // 检查列
        for (int i=0; i<row; ++i) { // 相当于剪枝
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }

        // 检查45度对角线
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        // 检查135度对角线
        for (int i=row-1, j=col+1; i>=0 && j<=n-1; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }
    private void backTrack(int n,int row,char[][] chessboard){
        if(row == n){
            res.add(charToList(chessboard));
        }
        for (int col = 0;col < n; ++col) {
            if (isValid (n,row,col, chessboard)) {
                chessboard[row][col] = 'Q';
                backTrack(n, row+1, chessboard);
                chessboard[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c:chessboard){
            Arrays.fill(c,'.');
        }
        backTrack(n,0,chessboard);
        return res;
    }
}
