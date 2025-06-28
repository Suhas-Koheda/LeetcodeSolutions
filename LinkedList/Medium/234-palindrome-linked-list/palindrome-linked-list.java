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
    public boolean isPalindrome(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null && fast.next.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }

        fast=reverse(slow.next);
        slow=head;

        while(fast!=null && slow!=null){
            if(slow.val!=fast.val){
                reverse(fast);
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        reverse(fast);
        return true;
    }

    public ListNode reverse(ListNode head){
        if(head==null ||head.next==null){
            return head;
        }
        ListNode newN=reverse(head.next);
        ListNode top=head.next;
        top.next=head;
        head.next=null;
        return newN;
    }


}