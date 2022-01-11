package backTrack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution131_2.java
 * @Description TODO
 * @createTime 2021年12月25日 19:57:00
 */
public class Solution131_2 {
    private List<List<String>> res = new LinkedList<>();
    private List<String> path = new LinkedList<>();
    private boolean flag = true;
    private Boolean isReverse(String s,int start,int end){
        for(int i = start,j = end;i <= j;i++,j--){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    private void backTrack(String s,int startIndex){

        if(startIndex == s.length()){
            res.add(new LinkedList<>(path));
            return;
        }
        for(int i = startIndex;i < s.length();i++){
            if(isReverse(s,startIndex,i)){
                path.add(s.substring(startIndex,i+1));
            }else {
                continue;
            }
            backTrack(s,i+1);
            path.remove(path.size()-1);
        }
    }
    public List<List<String>> partition(String s) {
        backTrack(s,0);
        return res;
    }
}
