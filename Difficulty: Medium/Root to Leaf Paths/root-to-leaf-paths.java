/* Definition for Node
class Node
{
	int data;
	Node left;
	Node right;
	Node(int val)
	{
		this.data = val;
		left = null;
		right = null;
	}
}
*/

class Solution {
	public ArrayList<ArrayList<Integer>> paths(Node root) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		dfs(root, list, mainList);
		return mainList;
	}
	
	public static void dfs(Node root, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> mainList) {
		if (root == null)
			return;
		list.add(root.data);
		if (root.left == null && root.right == null) {
			mainList.add(new ArrayList<>(list));
		}
		else {
			dfs(root.left, list, mainList);
			dfs(root.right, list, mainList);
		}
		list.remove(list.size() - 1);
	}
}
