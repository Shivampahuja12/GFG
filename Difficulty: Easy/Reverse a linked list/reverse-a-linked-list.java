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
        
        if (head == null) return head;
        
        Node temp = head;
        Node prev = null;
        while (temp != null){
            Node node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }
        
        return prev;
    }
}