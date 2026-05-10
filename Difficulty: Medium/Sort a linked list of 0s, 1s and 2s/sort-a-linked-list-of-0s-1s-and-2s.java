/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        Node temp = head;
        
        while (temp != null){
            if (temp.data == 0){
                cnt0++;
            }
            else if (temp.data == 1){
                cnt1++;
            }
            else {
                cnt2++;
            }
            temp = temp.next;
        }
        
        temp = head;
        int i = 0;
        while (i<cnt0){
            temp.data = 0;
            temp = temp.next;
            i++;
        }
        i = 0;
        while (i<cnt1){
            temp.data = 1;
            temp = temp.next;
            i++;
        }
        i = 0;
        while (i<cnt2){
            temp.data = 2;
            temp = temp.next;
            i++;
        }
        return head;
    }
}