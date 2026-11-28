/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    int maxi = 0;
    public int diameter(Node root) {
        maxi = 0;
        height(root);
        return maxi;
    }
    public int height(Node root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        maxi = Math.max(maxi, left + right);
        return 1 + Math.max(left, right);
    }
}