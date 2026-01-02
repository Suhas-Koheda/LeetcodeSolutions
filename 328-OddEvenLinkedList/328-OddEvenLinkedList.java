// Last updated: 02/01/2026, 10:09:33
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
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead=new ListNode(-1),oddHead=new ListNode(-1);
        ListNode even=evenHead,odd=oddHead;
        int count=1;
        while(head!=null){
            if(count%2==0){
                even.next=new ListNode(head.val);
                even=even.next;
            }
            if(count%2!=0){
                odd.next=new ListNode(head.val);
                odd=odd.next;
            }
            head=head.next;
            count++;
        }
        odd.next=evenHead.next;
        return oddHead.next;
    }
}