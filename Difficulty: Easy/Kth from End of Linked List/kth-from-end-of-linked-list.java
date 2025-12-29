/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        // int size = 0;
        
        // Node temp = head;
        // while (temp != null){
        //     size++;
        //     temp = temp.next;
        // }
        
        // if (k > size) return -1;
        
        // int count = 1;
        // temp = head;
        
        // while (count != (size - k + 1)){
        //     if (count == (size - k + 1)){
        //         break;
        //     }
        //     count++;
        //     temp = temp.next;
        // }
        
        // return temp.data;
        
        
        
        
        Node slow = head;
        Node fast = head;
        int i = 1;
        while (i<=k){
            if (fast == null){
                return -1;
            }
            fast = fast.next;
            i++;
        }
        
        
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
        
        
    }
}