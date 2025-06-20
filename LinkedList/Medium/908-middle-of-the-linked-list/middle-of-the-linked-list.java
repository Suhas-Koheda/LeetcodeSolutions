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
    public ListNode middleNode(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }
        int count=0;
        ListNode temp=head;
        while(head!=null){
            count++;
            head=head.next;
        }
        int mid=count/2+1;
        head=temp;
        int i=0;
        while(head!=null && i<mid-1){
            head=head.next;
            i++;
        }
        return head;
    }
}