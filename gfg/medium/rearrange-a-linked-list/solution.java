/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void rearrangeEvenOdd(Node head) {
        if (head == null || head.next == null) return;
        
        Node oddhead = head;
        Node oddTail = head;
        Node evenHead = head.next;
        Node evenTail = head.next;
        
        while (evenTail != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;
            
            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }
        oddTail.next = evenHead;
        return;
    }
}