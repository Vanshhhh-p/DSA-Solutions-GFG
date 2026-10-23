# Reverse Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a singly linked list. Reverse the linked list and return the head of the reversed list.

 **Examples:** 

```
Input:

Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linked list

```

```
Input: 

Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list

```

```
Input: 

Output: 8
Explanation:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T13:34:34.077Z  

```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    static Node solve (Node prev , Node curr) {
        // Base case
        if (curr == null) return prev;
        
        Node forward = curr.next;
        curr.next = prev;
        
        prev = curr;
        curr = forward;
        
        Node ans = solve(prev , curr);
        return ans;
    }
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node ans = solve (prev , curr);
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1)