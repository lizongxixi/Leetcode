package HashTable;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution383.java
 * @Description TODO
 * @createTime 2021年11月03日 10:55:00
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] nums = new int[26];
        for(int i = 0;i < magazine.length();i++){
            nums[magazine.charAt(i)-'a']++;
        }
        for(int i = 0;i < ransomNote.length();i++){
            nums[ransomNote.charAt(i)-'a']--;
        }
        for (int i : nums){
            if(i < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        "fihjjjjei"
//        "hjibagacbhadfaefdjaeaebgi"
        String s = "fihjjjjei";
        String t = "hjibagacbhadfaefdjaeaebgi";
        Solution383 solution383 = new Solution383();
        solution383.canConstruct(s,t);
    }
}
