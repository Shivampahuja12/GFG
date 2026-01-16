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
    Node deleteNode(Node head, int key) {
        // code here
        if (head == null) return head;
        if (head.next == head) {
            head = null;
            return head;
        }
        
        if (head.data == key){
            Node temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            
            head = head.next;
            temp.next = head;
            return head;
        }
        
        else {
            Node temp = head;
            while (temp.next != head && temp.next.data != key){
                temp = temp.next;
            }
            if (temp.next.data == key) {
                temp.next = temp.next.next;
            }
            return head;
        }
    }
}