# Add 1 to a Linked List Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given head of a linked list where each node contains a single digit. The digits together represent a number formed by concatenating the node values in order. Add 1 to this number and return the head of the modified linked list.

 **Examples :** 

```
Input: Head: 4->5->6
Output: 457

Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 

```

```
Input: Head: 1->2->3
Output: 124
 
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 
```

```
Input: Head: 0->0->1
Output: 002
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T13:04:49.583Z  

```java
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            Node forward = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // Reverse the given linked list
        head = reverse(head);
        
        // add 1 to main logic
        Node curr = head;
        int carry = 1;
        while (curr != null) {
            int nodeValue = curr.data;
            int sum = nodeValue + carry;
            int digit = sum % 10;
            
            // insert this digit into curr node
            curr.data = digit;
            
            // find out if there os any carry to pass on or not
            carry = sum / 10;
            
            // move curr + 1
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
            }
            curr = curr.next;
        }
        
        // reverse list again
        head = reverse(head);
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)