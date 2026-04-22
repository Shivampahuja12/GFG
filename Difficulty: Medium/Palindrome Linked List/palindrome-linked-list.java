/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = slow;
        slow = head;
        newHead = reverse(newHead);
        while (newHead != null){
            if (slow.data != newHead.data){
                return false;
            }
            slow = slow.next;
            newHead = newHead.next;
        }
        return true;
    }
    
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}