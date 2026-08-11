/*
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

class Pair {
	Node node;
	int line;
	public Pair(Node node, int line) {
		this.node = node;
		this.line = line;
	}
}
class Solution {
	public ArrayList<Integer> topView(Node root) {
		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i<size; i++) {
				Pair p = q.poll();
				Node noddy = p.node;
				int line = p.line;
				if (!map.containsKey(line)) {
					map.put(line, noddy.data);
				}
				if (noddy.left != null)
					q.add(new Pair(noddy.left, line - 1));
				if (noddy.right != null)
					q.add(new Pair(noddy.right, line + 1));
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			list.add(entry.getValue());
		}
		return list;
	}
}
