
class Solution {
    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        Node temp = head;
        int len = 0;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Reverse first k nodes or remaining nodes
        Node prev = null;
        Node curr = head;

        for (int i = 1; i <= k && curr != null; i++) {
            Node forward = curr.next;
            curr.next = prev;

            prev = curr;
            curr = forward;
        }

        // Recursively reverse remaining list
        Node recursiveAnsHead = reverseKGroup(curr, k);

        // Join both lists
        head.next = recursiveAnsHead;

        return prev;
    }
}
