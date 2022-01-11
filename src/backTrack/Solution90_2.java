package backTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution90_2.java
 * @Description TODO
 * @createTime 2022年01月02日 22:32:00
 */
public class Solution90_2 {
    List<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();
    public void backTrack(int[] nums,int startIndex){
        res.add(new LinkedList<>(path));
        if(startIndex >= nums.length){
            return;
        }
        for(int i = startIndex;i < nums.length;i++){
            //同一层里不能重复，而i>startIndex保证了在不同的树层中是可以取重复值的
            if(i > startIndex && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            backTrack(nums,i+1);
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums,0);
        return res;
    }
}
