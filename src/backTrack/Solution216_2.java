package backTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution216_2.java
 * @Description TODO
 * @createTime 2021年12月24日 19:59:00
 */
public class Solution216_2 {
    private ArrayList<Integer> path = new ArrayList<>();
    private List<List<Integer>> res = new LinkedList<>();
    private int sum = 0;
    private void backTrack(int k,int n,int startIndex){
        if (sum == n && path.size() == k){
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = startIndex;i <= 9;i++){
            sum += i;
            path.add(i);
            backTrack(k,n,i+1);
            sum -= i;
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n,1);
        return res;
    }
}
