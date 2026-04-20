/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node node = new Node(x);
        if (head == null){
            head = node;
            node.next = null;
            return head;
        }
        
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        
        temp.next = node;
        node.next = null;
        
        return head;
    }
}