// Last updated: 02/01/2026, 10:11:11
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp=(struct ListNode*)malloc(sizeof(struct ListNode));
    temp=head;
    int length=0;
    while(temp!=0){
        temp=temp->next;
        length++;
    }
    printf("%d",length);
    int i=1;
    struct ListNode* hold=(struct ListNode*)malloc(sizeof(struct ListNode));
    temp=head;  
    hold=head;
    if(length==0){
        free(head);
        return NULL;
    }
    if(n==length){
        hold=head->next;
        free(head);
        return hold;
    }
    for(int i=0;i<(length-n);i++){
        hold=temp;
        temp=temp->next;
    }
    hold->next=temp->next;
    return head;
}