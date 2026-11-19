# Linked List Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the  **head**  of a singly linked list, return an array containing the values of its nodes.

 **Examples:** 

```
Input:
    
Output: [1, 2, 3, 4, 5]
Explanation: The linked list contains 5 elements [1, 2, 3, 4, 5]. The elements are printed in a single line.
```

```
Input:
    
Output: [10, 20, 30, 40, 50, 60]
Explanation: The linked list contains 6 elements [10, 20, 30, 40, 50, 60]. The elements are printed in a single line.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:40:39.692Z  

```java
/* Structure for Linked List node
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
    public ArrayList<Integer> printList(Node head) {
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1)