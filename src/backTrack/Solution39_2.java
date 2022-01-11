package backTrack;

import java.util.*;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution39_2.java
 * @Description TODO
 * @createTime 2021年12月24日 22:05:00
 */
public class Solution39_2 {
    List<List<Integer>> result = new LinkedList<>();
    ArrayList<Integer> path = new ArrayList<>();
    int sum = 0;
    private void backTrack(int[] candidates,int target,int index){
        if (target <= sum){
            if(target < sum) return;
            //System.out.println(Arrays.toString(path.toArray()));
            result.add(new LinkedList<>(path));
            return;
        }
        for (int i = index;i < candidates.length;i++){
            sum+=candidates[i];
            path.add(candidates[i]);
            backTrack(candidates,target,i);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,target,0);
        return result;
    }
}
