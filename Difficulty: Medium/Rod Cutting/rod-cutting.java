class Solution {
	public int cutRod(int[] price) {
		// code here
		int n = price.length;
		int[] length = new int[n];
		for (int i = 1; i <= n; i++) {
			length[i - 1] = i;
		}
		int[][] t = new int[n + 1][n + 1];
		for (int[] i: t) {
			Arrays.fill(i, -1);
		}
		return cut(price, length, n, n - 1, t);
	}
	
	public int cut(int[] price, int[] length, int target, int n, int[][] t) {
		if (n < 0) {
			return target * price[0];
		}
		if (t[n][target] != -1)
			return t[n][target];
		if (length[n] <= target) {
			return t[n][target] = Math.max(price[n] + cut(price, length, target - length[n], n, t), cut(price, length, target, n - 1, t));
		} else {
			return t[n][target] = cut(price, length, target, n - 1, t);
		}
	}
}
