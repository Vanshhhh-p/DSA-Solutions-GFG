/*
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
    static Node reverse (Node head) {
        if (head == null || head.next == null) return head;
        
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        Node ansHead = new Node(-1);
        Node ansTail = ansHead;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int sum = 0;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            sum += carry;
            int digit = sum % 10;
            carry = sum / 10;
            
            Node newNode = new Node (digit);
            ansTail.next = newNode;
            ansTail = newNode;
        }
        ansHead = reverse(ansHead.next);
        // Remove leading zeros
        while (ansHead != null && ansHead.data == 0 && ansHead.next != null) {
            ansHead = ansHead.next;
        }
        return ansHead;
    }
}