/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        preOrder(list, root);
        return list;
    }
    public void preOrder(ArrayList<Integer> list, Node root){
        if (root == null) return;
        list.add(root.data);
        preOrder(list, root.left);
        preOrder(list, root.right);
    }
}