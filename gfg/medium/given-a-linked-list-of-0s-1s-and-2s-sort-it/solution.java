class Solution {
    public Node segregate(Node head) {
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;

        Node oneHead = new Node(-1);
        Node oneTail = oneHead;

        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                Node nodeToInsert = temp;
                temp = temp.next;
                zeroTail.next = nodeToInsert;
                zeroTail = nodeToInsert;
                zeroTail.next = null;
            }
            else if (temp.data == 1) {
                Node nodeToInsert = temp;
                temp = temp.next;
                oneTail.next = nodeToInsert;
                oneTail = nodeToInsert;
                oneTail.next = null;
            }
            else if (temp.data == 2) {
                Node nodeToInsert = temp;
                temp = temp.next;
                twoTail.next = nodeToInsert;
                twoTail = nodeToInsert;
                twoTail.next = null;
            }
        }

        // Join all my 3 lists
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;

        // Manually delete zero head
        zeroHead = zeroHead.next;

        // Returning modified linked list
        return zeroHead;
    }
}