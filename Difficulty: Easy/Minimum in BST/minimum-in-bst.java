/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
*/

class Solution {
    public int minValue(Node root) {
        // code here
        int min = Integer.MAX_VALUE;
        int[] a = {min};
        min(root, a);
        return a[0];
    }
    
    public void min(Node root, int[] a){
        if (root == null) return;
        if (root.data < a[0]){
            a[0] = root.data;
        } 
        min(root.left, a);
    }
}