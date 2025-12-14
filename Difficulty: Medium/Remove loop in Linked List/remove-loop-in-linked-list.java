/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow  = slow.next;
            fast = fast.next.next;
            
            if (slow == fast){
                isCycle = true;
                break;
            }
        }
        
        if (!isCycle) return;
        
        
        if (slow == head && slow == fast){
            Node temp = head;
            while (temp.next != fast){
                    temp = temp.next;
                }
            temp.next = null;
        }
        
        else { 
            slow = head;
            Node prev = fast;
            while (slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            
            prev.next = null; 
        }
        
    }
}