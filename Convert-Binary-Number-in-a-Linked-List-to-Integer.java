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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode t=head;
        while(t!=null){
            st.push(t.val);
            t=t.next;
        }
        int s=0;
        int p=0;
        while(!st.isEmpty()){
            int d=st.pop();
            if(d==1){
                s+=Math.pow(2,p);
            }
            p++;
        }
        return s;
    }
}