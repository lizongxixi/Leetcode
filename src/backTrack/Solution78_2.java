package backTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution78_2.java
 * @Description TODO
 * @createTime 2021年12月28日 15:38:00
 */
public class Solution78_2 {
    private List<List<Integer>> res = new LinkedList<>();
    private List<Integer> path = new LinkedList<>();
    private void backTrack(int[] nums,int startIndex){
        res.add(new LinkedList<>(path));
        if(startIndex >= nums.length){
            return;
        }
        for (int i = startIndex;i < nums.length;i++){
            path.add(nums[i]);
            backTrack(nums,i+1);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums,0);
        return res;
    }
}
