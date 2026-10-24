# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the  **head**  of a singly linked list of positive integers. You have to check if the given linked list is  **palindrome** or not.

 **Examples:** 

```
Input:
   
Output: true
Explanation: The given linked list is 1 -> 2 -> 1 -> 1 -> 2 -> 1, which is a palindrome.

```

```
Input:
   
Output: false
Explanation: The given linked list is 10 -> 20 -> 30 -> 40 -> 50, which is not a palindrome.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T06:30:07.775Z  

```java

class Solution {
    static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static Node reverse(Node prev, Node curr) {
        if (curr == null) {
            return prev;
        }

        Node forward = curr.next;

        curr.next = prev;
        prev = curr;
        curr = forward;

        Node newNode = reverse(prev, curr);
        return newNode;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node prev = null;
        Node list2 = middleNode(head);

        Node temp = head;
        while (temp.next != list2) {
            temp = temp.next;
        }

        temp.next = null;

        temp = head;
        Node curr = list2;
        Node temp1 = list2;
        temp1 = reverse(prev, curr);

        while (temp != null && temp1 != null) {
            if (temp.data != temp1.data) return false;
            else {
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        return true;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1)