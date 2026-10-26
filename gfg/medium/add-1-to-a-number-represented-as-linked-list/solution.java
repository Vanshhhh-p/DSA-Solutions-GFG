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