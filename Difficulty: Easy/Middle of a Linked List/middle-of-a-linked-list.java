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
        int length=0;
        Node fast=head;
        while(fast!=null){
            fast=fast.next;
            length++;
        }
        fast=head;
        for(int i=1;i<=length/2;i++){
            fast=fast.next;
        }
        return fast.data;
    }
}