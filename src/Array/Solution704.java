package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution704.java
 * @Description TODO
 * @createTime 2021年11月01日 10:36:00
 */
public class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }
    public int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target) right = mid;
            else left = mid+1;
        }
        return -1;
    }
}
//二分法总结
/*
 二分法的关键是要注意寻找的区间的定义
 比如这次我们用的区间就是[left,right]，这是一个左闭右闭的区间，那么left == right是有意义的，判断条件就应该是left <= right
 nums[mid] > target 时区间就应该变为[mid+1,right]
 nums[mid] < target 时区间就应该变为[left,mid-1]

 如果使用的区间是[left,right)
 那么right的初始值就应该是nums.length，这是一个左闭右开的区间，则left应该始终小于right，判断条件就应该是left < right
 nums[mid] > target 时区间就应该变为[mid+1,right)
 nums[mid] < target 时区间就应该变为[left,mid)
*/