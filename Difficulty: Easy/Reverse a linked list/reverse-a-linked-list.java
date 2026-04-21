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
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        head = prev;
        return head;
    }
}