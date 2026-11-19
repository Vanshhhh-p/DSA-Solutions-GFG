/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        Node head = new Node(-1);
        Node temp = head;

        for (int i = 0; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);

            temp.next = newNode;
            temp = temp.next;
        }

        return head.next;
    }
}
