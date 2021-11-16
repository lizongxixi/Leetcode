package List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution707.java
 * @Description TODO
 * @createTime 2021年10月29日 23:41:00
 */
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
class MyLinkedList {

    private class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    private ListNode dummy;
    private int _size;
    public MyLinkedList() {
        _size = 0;
        dummy = new ListNode();
    }

    public int get(int index) {
        if(_size >= index){
            ListNode cur = dummy;
            for(int i = 0;i <= index;i++){
                cur = cur.next;
            }
            return cur.val;
        }else{
            return -1;
        }
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val,null);
        node.next = dummy.next;
        dummy.next = node;
        _size++;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val,null);
        ListNode cur = dummy;
        while(cur.next!=null){
            cur = cur.next;
        }
        cur.next = node;
        _size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0){
            addAtHead(val);
            _size++;
        }
        if(_size >= index){
            ListNode cur = dummy;
            for(int i = 0;i < index;i++){
                cur = cur.next;
            }
            ListNode node = new ListNode(val,null);
            node.next = cur.next;
            cur.next = node;
            _size++;
        }

    }

    public void deleteAtIndex(int index) {
        if(_size > index){
            ListNode cur = dummy;
            for(int i = 0;i < index;i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            _size--;
        }

    }
}
public class Solution707 {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);            //返回3
    }
}