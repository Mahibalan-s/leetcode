1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if (head == null || head.next == null)
4            return head;
5
6        ListNode dummy = new ListNode(0, head);
7
8        ListNode current = dummy;
9        while (current.next != null && current.next.next != null) {
10            if (current.next.val == current.next.next.val) {
11                int duplicate = current.next.val;
12                while (current.next != null && current.next.val == duplicate)
13                    current.next = current.next.next;
14            } else {
15                current = current.next;
16            }
17        }
18        return dummy.next;
19    }
20}