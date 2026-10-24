# Merge Two Sorted Linked Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head**  of two sorted linked lists consisting of nodes respectively. Merge both lists and return the head of the sorted merged list.

 **Examples:** 

```
Input:
  
Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:
   
```

```
Input:
  
Output: 1 -> 1 -> 2 -> 4
Explanation:
  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T09:46:45.668Z  

```java

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node temp = null;
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                if (head == null) head = temp1;
                else temp.next = temp1;

                temp1 = temp1.next;
            }
            else {
                if (head == null) head = temp2;
                else temp.next = temp2;

                temp2 = temp2.next;
            }

            temp = (temp == null) ? head : temp.next;
        }

        if (temp1 != null) temp.next = temp1;
        if (temp2 != null) temp.next = temp2;

        return head;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1)