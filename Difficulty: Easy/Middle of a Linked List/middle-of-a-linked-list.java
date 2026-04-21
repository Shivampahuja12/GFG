/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        if (head.next == null){
            return head.data;
        }
        
        Node temp = head;
        int count = 0;
        
        while (temp != null){
            temp = temp.next;
            count++;
        }
        
        int i = 1;
        temp = head;
        
        while (i < (count/2) + 1){
            temp = temp.next;
            i++;
        }
        
        return temp.data;
    }
}