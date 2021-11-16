package Stack_and_Que;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution347_2.java
 * @Description TODO
 * @createTime 2021年11月11日 20:52:00
 */
public class Solution347_2 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        //统计频次
        for(int i:nums){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        //优先队列小顶堆
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(((o1, o2) -> o1.getValue() - o2.getValue()));
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            queue.offer(entry);
            if(queue.size() > k) queue.poll();
        }
        int[] res = new int[k];
        for (int i = 0;i < k;i++){
            res[i] = queue.poll().getKey();
        }
        return res;
    }
}
