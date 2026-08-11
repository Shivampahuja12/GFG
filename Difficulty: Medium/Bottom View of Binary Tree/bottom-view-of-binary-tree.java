/*
Definition for Node
class Node {
	int data;
	Node left;
	Node right;
	
	Node(int val) {
		data = val;
		left = right = null;
		
	}
}
*/
class Pair {
	Node node;
	int line;
	public Pair(Node node, int line) {
		this.node = node;
		this.line = line;
	}
}
class Solution {
	public ArrayList<Integer> bottomView(Node root) {
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.offer(new Pair(root, 0));
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i<size; i++) {
				Pair p = q.poll();
				Node node = p.node;
				int line = p.line;
				map.put(line, node.data);
				if (node.left != null)
					q.add(new Pair(node.left, line - 1));
				if (node.right != null)
					q.add(new Pair(node.right, line + 1));
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			list.add(entry.getValue());
		}
		return list;
	}
}
