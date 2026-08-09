/* Node Structure
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		data = val;
		left = right = null;
	}
} */

class Solution {
	public ArrayList<Integer> boundaryTraversal(Node root) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null)
			return result;
		
		// Add root
		if (!isLeaf(root))
            result.add(root.data);
		
		// Left boundary
		if (root.left != null)
			leftBoundary(result, root.left);
		
		// Leaf nodes
		bottomBoundary(result, root);
		
		// Right boundary
		if (root.right != null)
			rightBoundary(result, root.right);
		
		return result;
	}
	
	public static void leftBoundary(ArrayList<Integer> a, Node root) {
		if (root == null)
			return;
		if (isLeaf(root)) {
			return;
		}
		a.add(root.data);
		if (root.left != null) {
			leftBoundary(a, root.left);
		} else {
			leftBoundary(a, root.right);
		}
	}
	
	public static void bottomBoundary(ArrayList<Integer> a, Node root) {
		if (root == null)
			return;
		if (isLeaf(root)) {
			a.add(root.data);
			return;
		}
		if (root.left != null)
			bottomBoundary(a, root.left);
		if (root.right != null)
			bottomBoundary(a, root.right);
	}
	
	public static void rightBoundary(ArrayList<Integer> a, Node root) {
		Stack<Integer> st = new Stack<>();
		right(st, root);
		while (!st.isEmpty()) {
			a.add(st.pop());
		}
	}
	public static void right(Stack<Integer> st, Node root) {
		if (root == null)
			return;
		if (isLeaf(root)) {
			return;
		}
		st.push(root.data);
		if (root.right != null) {
			right(st, root.right);
		} else {
			right(st, root.left);
		}
	}
	
	public static boolean isLeaf(Node root) {
		if (root.left == null && root.right == null)
			return true;
		else
			return false;
	}
}
