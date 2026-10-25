/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        int count = 0;
        Node temp = head;
    
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (k > count) return -1;
        Node prev = head;
        Node curr = head;
        
        // curr ko abhi k jumps karwane h 
        for (int i = 1; i <= k; i++) {
            if (curr != null) curr = curr.next;
        }
        
        // first window is ready
        // now i can move my window
        while (curr != null) {
            curr = curr.next;
            prev = prev.next;
        }
        return prev.data;
    }
}