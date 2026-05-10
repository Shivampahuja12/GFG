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
    public static int helper(Node head){
        if (head == null){
            return 1;
        }
        int carry = helper(head.next);
        head.data += carry;
        if (head.data < 10){
            return 0;
        }
        head.data = 0;
        return 1;
    }
    
    public Node addOne(Node head) {
        int carry = helper(head);
        if (carry == 1){
            Node node = new Node(1);
            node.next = head;
            head = node;
        }
        return head;
    }
}