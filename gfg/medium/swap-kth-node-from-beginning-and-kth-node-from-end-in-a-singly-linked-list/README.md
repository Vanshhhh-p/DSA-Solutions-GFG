# Swap Kth Nodes from Ends

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a singly linked list and an integer  **k**. Swap the  **kth**  node (1-based index) from the beginning and the  **kth** node from the end of the linked list.

- Return the head of the final formed list.
- If it's not possible to swap the nodes return the original list.

 **Examples:** 

```
Input: k = 1,
  
Output: 5 -> 2 -> 3 -> 4 -> 1
Explanation: Here k = 1, hence after swapping the 1st node from the beginning and end the new list will be 5 -> 2 -> 3 -> 4 -> 1.
  

```

```
Input: k = 2,
  
Output: 5 -> 9 -> 8 -> 5 -> 10 -> 3
Explanation: Here k = 2, hence after swapping the 2nd node from the beginning and end the new list will be 5 -> 9 -> 8 -> 5 -> 10 -> 3.
  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T17:57:51.825Z  

```java

class Solution {
    public Node swapKth(Node head, int k) {
        if (head == null) return head;

        Node first = head;
        Node second = head;
        int len = 0;
        Node countNode = head;

        while (countNode != null) {
            countNode = countNode.next;
            len++;
        }

        if (k > len) return head;

        // Find kth node from the beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Find kth node from the end
        Node temp = head;
        for (int i = 1; i <= len - k; i++) {
            temp = temp.next;
        }
        second = temp;

        // Swap data
        int i = first.data;
        first.data = second.data;
        second.data = i;

        return head;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1)