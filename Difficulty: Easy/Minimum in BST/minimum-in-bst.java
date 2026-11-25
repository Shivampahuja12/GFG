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
        if (root == null) return -1;
        int[] ans = new int[1];
        min(root, ans);
        return ans[0];
    }
    
    public void min(Node root, int[] ans){
        ans[0] = root.data;
        if (root.left != null) min(root.left, ans);
    }
}