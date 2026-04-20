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
    public Node insertAtFront(Node head, int x) {
        // code here
        Node node = new Node(x);
        if (head == null){
            head = node;
            node.next = null;
        }
        node.next = head;
        head = node;
        return head;
    }
}