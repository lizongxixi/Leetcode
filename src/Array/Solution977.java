package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution977.java
 * @Description TODO
 * @createTime 2021年11月01日 21:20:00
 */
//自己写的哦，双指针
public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] newNum = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int rightNew = nums.length-1;
        while(left <= right){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                newNum[rightNew--] = nums[left] * nums[left];
                left++;
            }else{
                newNum[rightNew--] = nums[right] * nums[right];
                right--;
            }
        }
        return newNum;
    }
}
