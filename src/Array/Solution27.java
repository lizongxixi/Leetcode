package Array;
/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution27.java
 * @Description TODO
 * @createTime 2021年11月01日 14:15:00
 */
//
//输入：nums = [3,2,2,3], val = 3
//        输出：2, nums = [2,2]
//    输入：nums = [0,1,2,2,3,0,4,2], val = 2
//            输出：5, nums = [0,1,4,0,3]
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        int result = nums.length;
        while (left < right){
            if(nums[left] == val){
                result--;
                while(nums[right] == val){
                    right--;result--;
                }
                if(right > 0){
                    nums[left] = nums[right];
                    right--;
                }
            }
            left++;
        }
        return result;
    }

    public int removeElement1(int[] nums, int val) {

        // 快慢指针
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }

}
