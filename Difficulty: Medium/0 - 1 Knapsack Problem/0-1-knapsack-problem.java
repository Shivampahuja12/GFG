class Solution {
	public int knapsack(int W, int val[], int wt[]) {
		// code here
		int n = val.length;
		int t[][] = new int[n + 1][W + 1];
		for (int[] arr: t) {
			Arrays.fill(arr, -1);
		}
		return ks(W, val, wt, n, t);
	}
	
	public int ks(int w, int val[], int wt[], int n, int[][] t) {
		if (n == 0 || w == 0) {
			return 0;
		}
		if (t[n][w] != -1) {
			return t[n][w];
		}
		if (wt[n - 1] <= w) {
			return t[n][w] = Math.max(val[n - 1] + ks(w - wt[n - 1], val, wt, n - 1, t), ks(w, val, wt, n - 1, t));
		} else { // else if (wt[n - 1] > w)
			return t[n][w] = ks(w, val, wt, n - 1, t);
		}
	}
}
