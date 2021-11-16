package List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution203.java
 * @Description TODO
 * @createTime 2021年10月29日 23:30:00
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null){
            if(cur.next.val == val)cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummy.next;
    }
}
