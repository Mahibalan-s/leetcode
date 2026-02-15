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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        ListNode curr,pre,h1,t1,t,temp,next;
14        next=null;
15        temp=head;
16        h1=null;
17        t1=null;
18        curr=null;
19        pre=null;
20        t=null;
21        int i=1;
22        int l=0;
23        int r=0;
24        while(temp !=null){
25            if(left==right){
26                break;
27            }
28            if(i==left){
29                h1=pre;
30                t1=temp;
31                l=1;
32            }
33            else if(i==right){
34                t1.next=temp.next;
35                if(h1!=null){
36                    h1.next=temp;
37                }
38                else{
39                    head=temp;
40                }
41                temp.next=t;
42                break;
43            }
44            if(l==1){
45                next=temp.next;
46                temp.next=t;
47                t=temp;
48                temp=next;
49                i++;
50            }
51            else{
52                pre=temp;
53                temp=temp.next;
54                i++;
55            }
56        }
57        return head;
58    }
59}