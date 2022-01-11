package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution45_2.java
 * @Description TODO
 * @createTime 2022年01月09日 21:46:00
 */
public class Solution45_2 {
    public int jump(int[] nums) {
        if(nums.length <=1) return 0;
        int step = 1;
        int nowCover = nums[0];
        int cover = nums[0];
        for(int i = 0;i <= nowCover;i++){
            if(nowCover >= nums.length-1){
                return step;
            }
            if(i+nums[i] > cover){
                //寻找当前覆盖范围里，下一个最大的覆盖范围
                cover = i+nums[i];
            }
            if(i == nowCover){
                nowCover = cover;
                step++;
                if (cover >= nums.length-1){
                    return step;
                }
            }
        }
        return 0;
    }
}
