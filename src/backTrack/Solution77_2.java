package backTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution77_2.java
 * @Description TODO
 * @createTime 2021年12月24日 18:46:00
 */
public class Solution77_2 {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    private void backTracking(int n,int k,int startIndex){
        if (path.size() == k){
            result.add(new LinkedList<>(path));
            System.out.println(Arrays.toString(path.toArray()));
            return;
        }
        for (int i = startIndex;i <= n - (k - path.size()) + 1;i++){
            path.add(i);
            backTracking(n,k,i+1);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n,k,1);
        return result;
    }


}
