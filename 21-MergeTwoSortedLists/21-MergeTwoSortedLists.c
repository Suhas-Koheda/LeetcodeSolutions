// Last updated: 02/01/2026, 10:11:02
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* temp=(struct ListNode*)malloc(sizeof(struct ListNode));
        temp=list1;
        int len=0;
        while(temp!=NULL){
            temp=temp->next;
            len++;
        }
        int len2=0;
        temp=list2;
        while(temp!=NULL){
            temp=temp->next;
            len2++;
        }
        int i=0;int j=0;
        struct ListNode* l2=(struct ListNode*)malloc(sizeof(struct ListNode));
        struct ListNode* result=(struct ListNode*)malloc(sizeof(struct ListNode));
         if(list1 == NULL) return list2;
        if(list2 == NULL) return list1;
        if(list1==NULL && list2==NULL) return NULL;
        temp=list1;
        l2=list2;
        struct ListNode* add=result;
        while(list1!=NULL && list2!=NULL){
            if(list1->val<=list2->val){
                add->val=list1->val;
                list1=list1->next;
                add->next=(struct ListNode*)malloc(sizeof(struct ListNode));
                add=add->next;
            }
            else{
                add->val=list2->val;
                list2=list2->next;
                add->next=(struct ListNode*)malloc(sizeof(struct ListNode));
                add=add->next;
            }
        }
        while(list1!=NULL){
            add->val=list1->val;
            list1 = list1->next;
            if(list1!=NULL){
            add->next=(struct ListNode*)malloc(sizeof(struct ListNode));
            add = add->next;
            }
        }
        while(list2!=NULL){
            add->val=list2->val; 
            list2 = list2->next;
            if(list2!=NULL){
            add->next=(struct ListNode*)malloc(sizeof(struct ListNode));
            add = add->next;      
            }  
            }
            add->next=NULL;
        return result;

}