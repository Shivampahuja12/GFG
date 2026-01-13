/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        if (head == null || head.next == head){
            return true;
        }
        
        Node temp = head;
        while (temp.next != head){
            if (temp.next == null){
                return false;
            }
            temp = temp.next;
        }
        
        return true;
    }
}