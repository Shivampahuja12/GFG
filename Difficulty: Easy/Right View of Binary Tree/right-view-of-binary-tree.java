/*
Definition for Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
*/

class Solution {
	public ArrayList<Integer> rightView(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		dfs(root, 0, list);
		return list;
	}
	public static void dfs(Node root, int level, ArrayList<Integer> list) {
		if (root == null)
			return;
		if (level == list.size()) {
			list.add(root.data);
		}
		dfs(root.right, level + 1, list);
		dfs(root.left, level + 1, list);
	}
}
