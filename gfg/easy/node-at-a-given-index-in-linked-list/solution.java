/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int getNode(Node head, int k) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        
        if (k > count) return -1;
        
        temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}