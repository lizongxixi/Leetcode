package backTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution92_2.java
 * @Description TODO
 * @createTime 2021年12月25日 20:54:00
 */
public class Solution92_2 {
    List<String> result = new ArrayList<>();
    public void backtracking(String s,int startIndex,int pointNum){
        if(pointNum == 3 && isValid(s,startIndex,s.length()-1)){
            System.out.println(s);
            result.add(s);
            return;
        }
        if(pointNum > 3){
            return;
        }
        for(int i = startIndex;i < s.length();i++){
            if(isValid(s,startIndex,i)){
                pointNum++;
                s = s.substring(0,i+1) + "." + s.substring(i+1);
                backtracking(s,i+2,pointNum);
                pointNum--;
                s = s.substring(0,i+1) + s.substring(i+2);
            }else{
                break;
            }
        }
    }
    public boolean isValid(String s,int start,int end){
        if(start > end){
            return false;
        }
        if( s.charAt(start) == '0' && start!=end){
            return false;
        }
        int num = 0;
        for(int i = start; i <= end; i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if(num > 255){
                return false;
            }
        }
        return true;
    }
    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 12){
            return result;
        }
        backtracking(s,0,0);
        return result;
    }
}
