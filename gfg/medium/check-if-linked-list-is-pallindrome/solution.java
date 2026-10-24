
class Solution {
    static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static Node reverse(Node prev, Node curr) {
        if (curr == null) {
            return prev;
        }

        Node forward = curr.next;

        curr.next = prev;
        prev = curr;
        curr = forward;

        Node newNode = reverse(prev, curr);
        return newNode;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node prev = null;
        Node list2 = middleNode(head);

        Node temp = head;
        while (temp.next != list2) {
            temp = temp.next;
        }

        temp.next = null;

        temp = head;
        Node curr = list2;
        Node temp1 = list2;
        temp1 = reverse(prev, curr);

        while (temp != null && temp1 != null) {
            if (temp.data != temp1.data) return false;
            else {
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        return true;
    }
}
