/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        
        if (head.next == null) return head.next;
        
        Node temp = head;
        
        while (temp.next.next != null){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}