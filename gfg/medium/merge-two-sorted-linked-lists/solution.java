
class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node temp = null;
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                if (head == null) head = temp1;
                else temp.next = temp1;

                temp1 = temp1.next;
            }
            else {
                if (head == null) head = temp2;
                else temp.next = temp2;

                temp2 = temp2.next;
            }

            temp = (temp == null) ? head : temp.next;
        }

        if (temp1 != null) temp.next = temp1;
        if (temp2 != null) temp.next = temp2;

        return head;
    }
}
