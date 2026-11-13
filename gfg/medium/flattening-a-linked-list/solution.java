/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}*/


import java.util.*;

class Solution {

    public Node flatten(Node head) {
        if (head == null) return null;

        ArrayList<Node> list = new ArrayList<>();

        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = null;
            list.add(curr);
            curr = next;
        }

        while (list.size() > 1) {
            ArrayList<Node> merged = new ArrayList<>();

            for (int i = 0; i < list.size(); i += 2) {

                Node a = list.get(i);

                if (i + 1 < list.size()) {
                    Node b = list.get(i + 1);
                    merged.add(merge(a, b));
                } 
                else {
                    merged.add(a);
                }
            }

            list = merged;
        }

        return list.get(0);
    }

    public Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node temp = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {
                temp.bottom = a;
                a = a.bottom;
            } 
            else {
                temp.bottom = b;
                b = b.bottom;
            }

            temp = temp.bottom;
        }

        if (a != null) {
            temp.bottom = a;
        } 
        else {
            temp.bottom = b;
        }

        return dummy.bottom;
    }
}
