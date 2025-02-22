/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode t1,t2,pre;
        t1=dummy.next;
        t2=dummy.next;
        pre=t1;
        if(t1.next==null){
            return null;
        }
        while(t2!=null){
            if(t2.next==null){
                pre.next=t1.next;
                break;
            }
            else if(t2.next.next==null){
                t1.next=t1.next.next;
                break;
            }
            pre=t1;
            t1=t1.next;
            t2=t2.next.next;
        }
        return dummy.next;
    }
}