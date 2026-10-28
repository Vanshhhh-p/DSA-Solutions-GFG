class Solution {
    public Node partition(Node head, int x) {
        Node lesserHead = new Node(-1);
        Node lesserTail = lesserHead;

        Node equalHead = new Node(-1);
        Node equalTail = equalHead;

        Node greaterHead = new Node(-1);
        Node greaterTail = greaterHead;

        Node temp = head;

        while (temp != null) {
            Node nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            if (nodeToInsert.data < x) {
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;
            } else if (nodeToInsert.data == x) {
                equalTail.next = nodeToInsert;
                equalTail = nodeToInsert;
            } else {
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
            }
        }

        // Join all three lists
        lesserTail.next = equalHead.next;
        equalTail.next = greaterHead.next;

        if (lesserHead.next != null) {
            return lesserHead.next;
        } else if (equalHead.next != null) {
            return equalHead.next;
        } else {
            return greaterHead.next;
        }
    }
}