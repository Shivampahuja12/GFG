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
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node secondList = slow;
        Node prev = null;
        
        while (secondList != null){
            Node node = secondList.next;
            secondList.next = prev;
            prev = secondList;
            secondList = node;
        }
        
        Node first = head;
        Node second = prev;
        
        while (second != null){
            
            if (first.data != second.data){
                return false;
            }
            
            first = first.next;
            second = second.next;
        }
        return true;
    }
}