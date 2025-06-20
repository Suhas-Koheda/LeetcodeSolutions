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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s=new Stack<>();
        if(head==null ||  head.next==null ){
            return head;
        }
        while(head!=null){
            s.push(head.val);
            head=head.next;
        }
        ListNode second=new ListNode(s.pop());
        head=second;
        while(!s.isEmpty()){
            second.next=new ListNode(s.pop());
            second=second.next;
        }
        return head;
    }
}