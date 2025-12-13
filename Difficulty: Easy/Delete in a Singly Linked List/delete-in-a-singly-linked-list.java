/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        
        if (x == 1) {
            head = head.next;
            return head;
        }
        
        Node temp = head;
        int i = 1;
        while (i<x-1){
            i++;
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}