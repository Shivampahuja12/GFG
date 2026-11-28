/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
  public int height(Node root) {
    // code here
    if (root == null) return 0;
    return maxH(root) - 1;
  }
  public int maxH(Node root) {
    if (root == null) return 0;
    return 1 + Math.max(maxH(root.left), maxH(root.right));
  }
}