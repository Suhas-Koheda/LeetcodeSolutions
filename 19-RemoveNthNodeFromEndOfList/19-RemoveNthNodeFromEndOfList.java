// Last updated: 02/01/2026, 10:11:04
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
        ListNode temp=new ListNode();
        int len=0;
        temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        
        if(len==0){
            return null;
        }
        if(n==len){
            return head.next;
        }
        ListNode hold=new ListNode();
        temp=head;
        hold=head;
        for(int i=0;i<(len-n);i++){
            hold=temp;
            temp=temp.next;
        }
        hold.next=temp.next;
        return head;
    }
}