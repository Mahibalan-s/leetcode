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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode t1,t2;
        if(head==null || head.next==null){
            return head;
        }
        int n=0;
        t1=head;
        t2=head.next;
        while(t1!=null){
            n++;
            t1=t1.next;
        }
        if(k>n){
            k=k%n;
        }
        t1=head;
        for(int i=0;i<k;i++){
            while(t2.next!=null){
                t1=t2;
                t2=t2.next;
            }
            t2.next=head;
            t1.next=null;
            head=t2;
        }
        return head;
    }
}