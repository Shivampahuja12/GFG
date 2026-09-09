class Solution {
	public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] vis = new boolean[adj.size()];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		vis[0] = true;
		while (!q.isEmpty()) {
			int val = q.poll();
			list.add(val);
			for (int i = 0; i<adj.get(val).size(); i++) {
				if (!vis[adj.get(val).get(i)]) {
					q.add(adj.get(val).get(i));
					vis[adj.get(val).get(i)] = true;
				}
			}
		}
		return list;
	}
}
