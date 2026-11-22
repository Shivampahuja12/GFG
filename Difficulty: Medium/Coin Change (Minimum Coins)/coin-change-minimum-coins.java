class Solution {
	public int minCoins(int coins[], int sum) {
		int n = coins.length;
		int[][] t = new int[n+1][sum+1];
		for (int[] i: t){
		    Arrays.fill(i, -1);
		}
		int result = cc(coins, n - 1, sum, t);
		return result == (int) 1e9 ? -1 : result;
	}
	
	public int cc(int coins[], int n, int sum, int[][] t) {
		if (sum == 0) return 0;
		if (n < 0) return (int) 1e9;
		if (t[n][sum] != -1) return t[n][sum];
		if (coins[n] <= sum) {
			return t[n][sum] = Math.min(1 + cc(coins, n, sum - coins[n], t), cc(coins, n - 1, sum, t));
		} else {
			return t[n][sum] = cc(coins, n - 1, sum, t);
		}
	}
}
