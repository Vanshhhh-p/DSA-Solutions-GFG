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
