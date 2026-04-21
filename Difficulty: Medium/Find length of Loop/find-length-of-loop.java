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
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                isCycle = true;
                break;
            }
        }
        
        if (!isCycle){
            return 0;
        }
        
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        Node countPtr = slow;
        int count = 0;
        
        while (countPtr.next != fast){
            count++;
            countPtr = countPtr.next;
        }
        
        return count + 1;
        
    }
}