/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
} */
class Solution {
    public static void removeLoop(Node head) {
        Node slow = head , fast = head;
                boolean hasCycle = false;

                while (fast != null && fast.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;

                    if (slow == fast) {
                        hasCycle = true;
                        break;
                    }
                }

                if (hasCycle == false) return;

                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                Node startingCycleNode = slow;
                Node temp = startingCycleNode.next;
                
                while (temp.next != startingCycleNode) {
                    temp = temp.next;
                }
                temp.next = null;
    }
}