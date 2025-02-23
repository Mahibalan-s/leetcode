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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0,head);
        ListNode t=dummy;
        int s=0;
        if(n==1&&head.next==null){
            return null; 
        }
        for(int i=0;i<n;i++){
            head=head.next;
        }
        while(head!=null){
            head=head.next;
            t=t.next;
        }
        t.next=t.next.next;
        return dummy.next;
    }
}