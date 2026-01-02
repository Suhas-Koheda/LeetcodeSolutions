# Last updated: 02/01/2026, 10:07:33
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def ListNode_to_List(root: ListNode):
    lst = list()
    while root:
        lst.append(root.val)
        root = root.next
    return lst

def List_to_ListNode(lst: list):
    root = None
    for x in lst:
        root = ListNode(x, root)
    return root

class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        lst = ListNode_to_List(head)
        res = []

        for x in lst:
            if x == 0:
                res.append(0)
            res[-1] += x
        res.pop()

        res.reverse()
        return List_to_ListNode(res)