package List;

import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution206.java
 * @Description TODO
 * @createTime 2021年10月30日 10:45:00
 */
public class Solution206 {

    //双指针
    public ListNode reverseList1(ListNode head) {
        if(head == null) return head;
        ListNode pre = null;
        ListNode cur = head;
        ListNode fast = head.next;
        while(cur.next != null){
            cur.next = pre;
            pre = cur;
            cur = fast;
            fast = fast.next;
        }
        cur.next = pre;
        return cur;
    }
    //栈
    public ListNode reverseList2(ListNode head) {
        if(head == null) return null;
        Stack<ListNode> st = new Stack();
        while(head != null){
            st.push(head);
            head = head.next;
        }
        ListNode newHead = st.pop();
        ListNode cur = newHead;
        while(!st.empty()){
            cur.next = st.pop();
            cur = cur.next;
        }
        cur.next = null;
        return newHead;
    }
    //递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


}
