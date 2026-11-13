# Flatten Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a linked list, every node has two pointers:  **next** and  **bottom**. The heads of  **n**  linked lists are connected using the next pointer, while the bottom pointer points to the next node in the current linked list.

Each linked list is sorted in non-decreasing order of data, and the head nodes are also sorted in non-decreasing order.

Given the  **head**  of the first linked list, flatten the linked lists into a single sorted linked list such that every node is connected using only the bottom pointers.

 **Examples:** 

```
Input:

Output: 5 -> 7 -> 8 -> 10 -> 19 -> 20 -> 22 -> 28 -> 40 -> 45.
Explanation: 
Bottom pointer of 5 is pointing to 7.
Bottom pointer of 7 is pointing to 8.
Bottom pointer of 10 is pointing to 20 and so on.
So, after flattening the linked list the sorted list will be 
5 -> 7 -> 8 -> 10 -> 19 -> 20 -> 22 -> 28 -> 40 -> 45.
```

```
Input:

Output: 5 -> 7 -> 8 -> 10 -> 19 -> 22 -> 28 -> 30 -> 50
Explanation:
Bottom pointer of 5 is pointing to 7.
Bottom pointer of 7 is pointing to 8.
Bottom pointer of 8 is pointing to 30 and so on.
So, after flattening the linked list the sorted list will be 
5 -> 7 -> 8 -> 10 -> 19 -> 22 -> 28 -> 30 -> 50.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T19:01:20.099Z  

```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}*/


import java.util.*;

class Solution {

    public Node flatten(Node head) {
        if (head == null) return null;

        ArrayList<Node> list = new ArrayList<>();

        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = null;
            list.add(curr);
            curr = next;
        }

        while (list.size() > 1) {
            ArrayList<Node> merged = new ArrayList<>();

            for (int i = 0; i < list.size(); i += 2) {

                Node a = list.get(i);

                if (i + 1 < list.size()) {
                    Node b = list.get(i + 1);
                    merged.add(merge(a, b));
                } 
                else {
                    merged.add(a);
                }
            }

            list = merged;
        }

        return list.get(0);
    }

    public Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node temp = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                temp.bottom = a;
                a = a.bottom;
            } 
            else {
                temp.bottom = b;
                b = b.bottom;
            }

            temp = temp.bottom;
        }

        if (a != null) {
            temp.bottom = a;
        } 
        else {
            temp.bottom = b;
        }

        return dummy.bottom;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1)