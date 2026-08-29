class Solution {
	public int countWays(int n) {
		// code here
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return steps(dp, n);
	}
	
	public int steps(int[] dp, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (dp[n] != -1)
			return dp[n];
		int left = steps(dp, n - 1);
		int right = steps(dp, n - 2);
		dp[n] = left + right;
		return dp[n];
	}
}
