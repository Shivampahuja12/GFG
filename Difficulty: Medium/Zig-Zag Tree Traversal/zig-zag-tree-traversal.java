/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
} */

class Solution {
	ArrayList<Integer> zigZagTraversal(Node root) {
		// code here
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		ArrayList<Integer> list = new ArrayList<>();
		boolean flag = true;
		int idx = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> level = new ArrayList<>();
			for (int i = 0; i<size; i++) {
				Node node = q.remove();
				if (flag) {
					level.add(node.data);
                }
				else {
					level.add(0, node.data);
				}
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
			}
			
			list.addAll(level);
			if (flag)
				flag = false;
			else
				flag = true;
		}
		
		return list;
	}
}
