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
    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        } else {
            temp.next = l2;
        }
        return merged.next;
    }

    ListNode findMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = findMiddle(head);
        ListNode right = middle.next;
        middle.next = null;
        ListNode left = head;
        left=sort(left);
        right=sort(right);
        return merge(left,right);
    }
}