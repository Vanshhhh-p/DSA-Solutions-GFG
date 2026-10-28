/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        Node prev = null , curr = head;
        // repeat 
        // ignore 
        // delete
        
        while (curr != null) {
            // ignore
            for (int i = 1; i <= m && curr != null; i++) {
                prev = curr;
                curr = curr.next;
            }
            // it is important
            if (curr == null) {
                return;
            }
            
            // delete 
            for (int i = 1; i <= n && curr != null; i++) curr = curr.next;
            // link rearrange
            prev.next = curr;
        }
    }
}