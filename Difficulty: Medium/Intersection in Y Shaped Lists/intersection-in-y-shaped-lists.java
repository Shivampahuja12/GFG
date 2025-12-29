/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // // using nested for loop - TLE
        // Node temp2 = head2;
        // while (temp2 != null){
        //     Node temp = head1;
        //     while (temp != null){
        //         if (temp == temp2){
        //             return temp;
        //         }
        //         temp = temp.next;
        //     }
        //     temp2 = temp2.next;
        // }
        // return null; 
        
        
        // using two pointer (gfg theory)
        Node ptr1 = head1;
        Node ptr2 = head2;
        
        if (ptr1 == null || ptr2 == null){
            return null;
        }
        
        while (ptr1 != ptr2){
            ptr1 = (ptr1 != null) ? ptr1.next : head2;
            ptr2 = (ptr2 != null) ? ptr2.next : head1;
        }
        
        return ptr1;
    }
}