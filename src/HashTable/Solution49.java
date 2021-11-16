package HashTable;

import java.util.*;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution49.java
 * @Description TODO
 * @createTime 2021年11月03日 11:12:00
 */
//strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] theKey = s.toCharArray();
            Arrays.sort(theKey);
            String Key = new String(theKey);
            List<String> list = map.getOrDefault(Key,new LinkedList<>());
            list.add(s);
            map.put(Key,list);
        }
        return new LinkedList<List<String>>(map.values());
    }

}
