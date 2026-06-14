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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode front=slow.next;
            slow.next=prev;
            prev=slow;
            slow=front;
        }
        int ans=0;

        
        ListNode p1=head;
        ListNode p2=prev;

        while(p2!=null){
            ans=Math.max(ans,p1.val+p2.val);
            p1=p1.next;
            p2=p2.next;
        }
        return ans;
    }
}