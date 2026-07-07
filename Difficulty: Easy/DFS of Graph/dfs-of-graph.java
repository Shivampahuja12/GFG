class Solution {
	public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
		boolean[] vis = new boolean[adj.size()];
		vis[0] = true;
		ArrayList<Integer> list = new ArrayList<>();
		dfsOnGraph(0, vis, adj, list);
		return list;
	}
	public static void dfsOnGraph(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
		// marking current node as visited
		vis[node] = true;
		list.add(node);
		
		for (Integer it: adj.get(node)) {
			if (vis[it] == false) {
				dfsOnGraph(it, vis, adj, list);
			}
		}
	}
}
