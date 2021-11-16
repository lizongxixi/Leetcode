package List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution142.java
 * @Description TODO
 * @createTime 2021年10月30日 22:02:00
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        ListNode mark = null;
        while(fast != slow){
            //遍历过程遇到null说明无环
            if(fast == null ||fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }
        mark = slow;
        slow = head;
        fast = mark;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    //卡哥优雅解法
    public ListNode detectCycle1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode index1 = head;
                ListNode index2 = fast;
                while(index1 != index2){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
