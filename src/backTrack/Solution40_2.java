package backTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution40_2.java
 * @Description TODO
 * @createTime 2021年12月24日 22:29:00
 */
public class Solution40_2 {
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
            //在本层该元素已经使用(i == index表明在本层是第一次使用)
            if(i > index && candidates[i] == candidates[i-1]) continue;
            sum+=candidates[i];
            path.add(candidates[i]);
            backTrack(candidates,target,i+1);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates,target,0);
        return result;
    }
}
