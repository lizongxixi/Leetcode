package backTrack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution17_2.java
 * @Description TODO
 * @createTime 2021年12月24日 20:12:00
 */
public class Solution17_2 {
    List<String> res = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    Map<Integer,String> map = new HashMap<>();
    private void backTrack(String digits,int startIndex){
        if(sb.length() == digits.length()){
            res.add(sb.toString());
            return;
        }
        int num = digits.charAt(startIndex)-'0';
        String letter = map.get(num);
        for(int i = 0;i < letter.length();i++){
            sb.append(letter.charAt(i));
            backTrack(digits,startIndex+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")){
            return res;
        }
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        backTrack(digits,0);
        return res;
    }
}
