package backTrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution47_2.java
 * @Description TODO
 * @createTime 2022年01月04日 20:52:00
 */
public class Solution47_2 {
    List<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new LinkedList<>();
    private void backTrack(int[] nums,int startIndex,int[] used){

        if (path.size() == nums.length){
            res.add(new LinkedList<>(path));
        }
        for (int i = 0;i < nums.length;i++){
            //同一层去重
            if (i>0 && used[i-1] == 0 && nums[i] == nums[i-1]) continue;
            //使用used数组对同一路径去重
            if (used[i] == 1) continue;
            path.add(nums[i]);
            used[i] = 1;
            backTrack(nums,i+1,used);
            used[i] = 0;
            path.remove(path.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        backTrack(nums,0,used);
        return res;
    }
}
