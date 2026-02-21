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
12    public ListNode oddEvenList(ListNode head) {
13        if(head==null || head.next==null || head.next.next==null){
14            return head;
15        }
16        ListNode temp1=head;
17        ListNode temp2=head.next;
18        ListNode l1=new ListNode(0,head);
19        l1=l1.next;
20        ListNode l2=new ListNode(0,head);
21        ListNode dummy=l1;
22        l2=l2.next.next;
23        ListNode dummy1=l2;
24        while((l1!=null && l1.next!=null && l1.next.next!=null) && (l2!=null && l2.next!=null && l2.next.next!=null)){
25            
26            l1.next=l1.next.next;
27            l2.next=l2.next.next;
28            l1=l1.next;
29            l2=l2.next;
30        }
31        if(l1!=null && l1.next!=null && l1.next.next!=null){
32            l1.next=l1.next.next;
33            l1=l1.next;
34        }
35        l2.next=null;
36        l1.next=dummy1;
37        return dummy;
38    }
39}