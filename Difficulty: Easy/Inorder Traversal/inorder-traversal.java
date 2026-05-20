/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorder(list, root);
        return list;
    }
    public void inorder(ArrayList<Integer> list, Node root){
        if (root == null) return;
        inorder(list, root.left);
        list.add(root.data);
        inorder(list, root.right);
    }
}