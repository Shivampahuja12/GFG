/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = this.right = null;
	}
} */

class Solution {
	public ArrayList<Integer> leftView(Node root) {
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
		dfs(root.left, level + 1, list);
		dfs(root.right, level + 1, list);
	}
}
