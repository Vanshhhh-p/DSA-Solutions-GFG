# Linked List Group Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a Singly linked list, reverse every  **k**  node in the linked list and return the head of the modified list. If the node count is not a multiple of k then the left-out nodes at the end, should be considered as a group and must be reversed.

 **Examples:** 

```
Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2

Output: 2 -> 1 -> 4 -> 3 -> 6 -> 5
Explanation: Linked List is reversed in a group of size k = 2.

```

```
Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 4,

Output: 4 -> 3 -> 2 -> 1 -> 6 -> 5
Explanation: Linked List is reversed in a group of size k = 4.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T13:16:32.652Z  

```java

class Solution {
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Reverse first k nodes or remaining nodes
        Node prev = null;
        Node curr = head;

        for (int i = 1; i <= k && curr != null; i++) {
            Node forward = curr.next;
            curr.next = prev;

            prev = curr;
            curr = forward;
        }

        // Recursively reverse remaining list
        Node recursiveAnsHead = reverseKGroup(curr, k);

        // Join both lists
        head.next = recursiveAnsHead;

        return prev;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1)