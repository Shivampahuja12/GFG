class Solution {
	public boolean checkSubsequenceSum(int[] arr, int k) {
		
		int n = arr.length;
		// dp[i][sum] = result for state (i, sum)
		Boolean[][] dp = new Boolean[n + 1][k + 1];
		return isPresent(0, dp, arr, k, 0);
	}
	
	public boolean isPresent(int i, Boolean[][] dp, int[] arr, int k, int sum) {
		if (sum == k) {
			return true;
		}
		
		if (i == arr.length) {
			
			return false;
		}
		
		if (dp[i][sum] != null) {
			return dp[i][sum];
		}
		
		boolean take = false;
		if (sum + arr[i] <= k) {
			take = isPresent(i + 1, dp, arr, k, sum + arr[i]);
		}
		
		boolean notTake = isPresent(i + 1, dp, arr, k, sum);
		
		dp[i][sum] = take || notTake;
		
		return dp[i][sum];
	}
}
