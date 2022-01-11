package backTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution491_2.java
 * @Description TODO
 * @createTime 2022年01月02日 23:00:00
 */
public class Solution491_2 {
    List<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();
    private void backTrack(int[] nums,int startIndex){
        if(path.size()>1) res.add(new LinkedList<>(path));
        if(startIndex >= nums.length) return;
        //进行层内去重
        int[] used = new int[201];
        for(int i = startIndex;i < nums.length;i++){
            if (used[nums[i]+100] == 1) continue;
            if(path.size()>0 && nums[i] < path.get(path.size()-1) ) continue;
            path.add(nums[i]);
            used[nums[i]+100] = 1;
            backTrack(nums,i+1);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        backTrack(nums,0);
        return res;
    }
}
