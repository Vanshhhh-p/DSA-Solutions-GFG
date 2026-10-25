/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        if (head == null || head.next == null) return head;
        Node prev = head;
        Node curr = head.next;
        
        while (curr != null) {
            if (prev.data != curr.data) {
                prev = prev.next;
                curr= curr.next;
            }
            else {
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        return head;
    }
}