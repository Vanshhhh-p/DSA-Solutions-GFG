class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node temp = head;
        int len = 1;

        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;

        // Connect tail to head
        temp.next = head;

        temp = head;

        // Find kth node
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        // Update head and break the circle
        Node forward = temp.next;
        temp.next = null;

        return forward;
    }
}