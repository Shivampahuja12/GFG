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
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node temp = head;
        int temper = 2;
        Node node = new Node(val);
        
        if (pos == 1){
            node.next = head;
            head = node;
            return head;
        }
        
        while (temper < pos){
            temp = temp.next;
            temper++;
        }
        
        if (temp.next != null){
            Node agli = temp.next;
            temp.next = node;
            node.next = agli;
            return head;
        }
        
        temp.next = node;
        node.next = null;
        return head;
    }
}