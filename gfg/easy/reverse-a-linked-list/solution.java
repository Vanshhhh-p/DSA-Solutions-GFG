/* Structure of Linked List Node
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
    static Node solve (Node prev , Node curr) {
        // Base case
        if (curr == null) return prev;
        
        Node forward = curr.next;
        curr.next = prev;
        
        prev = curr;
        curr = forward;
        
        Node ans = solve(prev , curr);
        return ans;
    }
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        Node ans = solve (prev , curr);
        return ans;
    }
}