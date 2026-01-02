// Last updated: 02/01/2026, 10:11:10
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode();
        temp=list1;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int len2=0;
        temp=list2;
        while(temp!=null){
            temp=temp.next;
            len2++;
        }
        int i=0;int j=0;
        ListNode l2=new ListNode();
        ListNode result=new ListNode();
         if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1==null && list2==null) return null;
        temp=list1;
        l2=list2;
        ListNode add=result;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                add.val=list1.val;
                list1=list1.next;
                add.next=new ListNode();
                add=add.next;
            }
            else{
                add.val=list2.val;
                list2=list2.next;
                add.next=new ListNode();
                add=add.next;
            }
        }
        while(list1!=null){
            add.val=list1.val;
            list1 = list1.next;
            if(list1!=null){
            add.next=new ListNode();
            add = add.next;
            }
        }
        while(list2!=null){
            add.val=list2.val; 
            list2 = list2.next;
            if(list2!=null){
            add.next=new ListNode();
            add = add.next;      
            }  
            }
        return result;
    }
}
