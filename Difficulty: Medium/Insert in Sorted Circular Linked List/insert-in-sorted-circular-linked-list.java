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
    public Node sortedInsert(Node head, int data) {
        // code here
        
        Node node = new Node(data);
      
      // if head is null
        if (head == null){
          node.next = node;
          return node;
      }
      
      
      // insert in starting
      if (data <= head.data){
          
          Node temp = head;
          while (temp.next != head){
              temp = temp.next;
          }
          temp.next = null;
          
          node.next = head;
          head = node;
          
          temp.next = head;
          return head;
          
      }
      
      // insert in between
      Node dummy = new Node(-1);
      dummy.next = head;
      Node prev = dummy;
      boolean flag = false;
      while (prev.next.data < data){
          if (prev.next.next == head && prev.next.data < data){
              prev = prev.next;
              flag = true;
              break;
          }
          prev = prev.next;
      }
      
      if (flag){
          prev.next = node;
          node.next = head;
          return head;
      }
      
      Node add = prev.next;
      prev.next = node;
      node.next = add;
   
      return head;
      
      
      
      
        
    }
}