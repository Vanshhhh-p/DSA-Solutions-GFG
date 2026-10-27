# Sort Llinked List of 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a linked list where nodes can contain values  **0s**,  **1s,**  and  **2s** only. Your task is to rearrange the list so that all  **0s**  appear at the beginning, followed by all  **1s**, and all  **2s**  are placed at the end.

 **Examples:** 

```
Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
   
Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between. The final list will be:
   
```

```
Input: head = 2 → 2 → 0 → 1
   
Output: 0 → 1 → 2 → 2
Explanation: After arranging all the 0s, 1s and 2s in the given format, the output will be:
   
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T12:43:23.349Z  

```java
class Solution {
    public Node segregate(Node head) {
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;

        Node oneHead = new Node(-1);
        Node oneTail = oneHead;

        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                Node nodeToInsert = temp;
                temp = temp.next;
                zeroTail.next = nodeToInsert;
                zeroTail = nodeToInsert;
                zeroTail.next = null;
            }
            else if (temp.data == 1) {
                Node nodeToInsert = temp;
                temp = temp.next;
                oneTail.next = nodeToInsert;
                oneTail = nodeToInsert;
                oneTail.next = null;
            }
            else if (temp.data == 2) {
                Node nodeToInsert = temp;
                temp = temp.next;
                twoTail.next = nodeToInsert;
                twoTail = nodeToInsert;
                twoTail.next = null;
            }
        }

        // Join all my 3 lists
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;

        // Manually delete zero head
        zeroHead = zeroHead.next;

        // Returning modified linked list
        return zeroHead;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1)