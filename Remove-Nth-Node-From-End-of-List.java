1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next=head;
15        ListNode t1=dummy;
16        ListNode t2=dummy;
17        for(int i=0;i<n;i++){
18            t1=t1.next;
19        }
20        while(t1.next!=null){
21            t1=t1.next;
22            t2=t2.next;
23        }
24        t2.next=t2.next.next;
25        return dummy.next;
26    }
27}
28