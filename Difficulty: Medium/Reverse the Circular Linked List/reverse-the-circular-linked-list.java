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
    public Node reverseCircular(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        
        do {
            Node add = curr.next;
            curr.next = prev;
            prev = curr;
            curr = add;
        } while(curr != head);
        
        curr.next = prev;
        head = prev;
        return head;
    }
}