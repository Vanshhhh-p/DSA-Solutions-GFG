# Remove Cycle in Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head** of a singly linked list. A cycle exists if the last node points back to a previous node, forming a loop. Remove the loop from the linked list if it exists.

Internally, the driver code uses a variable  **x**  (1-based indexing) to represent the position of the node to which the last node is connected.

The driver code will print "true" if the linked list is correctly modified, otherwise it will print "false".

 **Examples:** 

```
Input:

Output: true
Explanation: The linked list contains a loop that begins at node x = 2. After removing the loop, the driver code prints true.
```

```
Input:

Output: true
Explanation: The linked list does not contain a loop (x = 0).
```

```
Input: 

Output: true
Explanation: The linked list contains a loop that begins at node x = 1. After removing the loop, the driver code prints true.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T01:25:32.998Z  

```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        Node slow = head , fast = head;
                boolean hasCycle = false;

                while (fast != null && fast.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;

                    if (slow == fast) {
                        hasCycle = true;
                        break;
                    }
                }

                if (hasCycle == false) return;

                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                Node startingCycleNode = slow;
                Node temp = startingCycleNode.next;
                
                while (temp.next != startingCycleNode) {
                    temp = temp.next;
                }
                temp.next = null;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1)