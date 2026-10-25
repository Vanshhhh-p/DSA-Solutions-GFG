# Segregate Evens and Odds in a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head** of a singly linked list, rearrange the list in place so that all nodes containing even values appear before nodes containing odd values. Return the head of the modified linked list.

 **Note:** The relative order of the even nodes and the odd nodes should remain unchanged.

 **Examples:** 

```
Input:
 
Output: 8 -> 2 -> 4 -> 6 -> 17 -> 15 -> 9
Explanation: Since 8, 2, 4, and 6 are even, they appear first in the list, followed by the odd numbers 17, 15, and 9.

```

```
Input:
 
Output: 1 -> 3 -> 5 -> 7
Explanation: There is no even number, so no modification is needed.

```

 **Constraints:** 
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-25T12:15:40.853Z  

```java
/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/


class Solution {
    Node divide(Node head) {
        if (head == null) {
            return head;
        }

        Node even = new Node(-1);
        Node evenHead = even;

        Node odd = new Node(-1);
        Node oddHead = odd;

        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenHead.next = temp;
                evenHead = evenHead.next;
            } else {
                oddHead.next = temp;
                oddHead = oddHead.next;
            }
            temp = temp.next;
        }

        oddHead.next = null;
        evenHead.next = odd.next;

        return even.next;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1)