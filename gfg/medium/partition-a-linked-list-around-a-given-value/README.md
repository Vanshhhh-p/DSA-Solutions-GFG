# Partition Linked List Around Value

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the head of a linked list and an integer  **x**, rearrange the list such that:
- All nodes with values less than x appear first,
- Followed by equal to x,
- Followed by greater than x.
The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed in-place.
 
 **Examples:** 

```
Input: head: 1->4->2->10, x = 3
 
Output: 1->2->4->10

Explanation: Nodes with value less than 3 come first, then equal to 3 and then greater than 3.
```

```
Input: head: 1->4->3->2->5->2->3, x = 3
 
Output: 1->2->2->3->3->4->5
 
Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.

```

 **Constraints:** 
1 ≤ size of linked list ≤ 105
1 ≤ data of node ≤ 105
1 ≤ x ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T03:15:51.596Z  

```java
class Solution {
    public Node partition(Node head, int x) {
        Node lesserHead = new Node(-1);
        Node lesserTail = lesserHead;

        Node equalHead = new Node(-1);
        Node equalTail = equalHead;

        Node greaterHead = new Node(-1);
        Node greaterTail = greaterHead;

        Node temp = head;

        while (temp != null) {
            Node nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            if (nodeToInsert.data < x) {
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;
            } else if (nodeToInsert.data == x) {
                equalTail.next = nodeToInsert;
                equalTail = nodeToInsert;
            } else {
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
            }
        }

        // Join all three lists
        lesserTail.next = equalHead.next;
        equalTail.next = greaterHead.next;

        if (lesserHead.next != null) {
            return lesserHead.next;
        } else if (equalHead.next != null) {
            return equalHead.next;
        } else {
            return greaterHead.next;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1)