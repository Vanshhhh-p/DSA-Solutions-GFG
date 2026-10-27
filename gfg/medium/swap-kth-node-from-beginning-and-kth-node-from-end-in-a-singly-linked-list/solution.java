
class Solution {
    public Node swapKth(Node head, int k) {
        if (head == null) return head;

        Node first = head;
        Node second = head;
        int len = 0;
        Node countNode = head;

        while (countNode != null) {
            countNode = countNode.next;
            len++;
        }

        if (k > len) return head;

        // Find kth node from the beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Find kth node from the end
        Node temp = head;
        for (int i = 1; i <= len - k; i++) {
            temp = temp.next;
        }
        second = temp;

        // Swap data
        int i = first.data;
        first.data = second.data;
        second.data = i;

        return head;
    }
}
