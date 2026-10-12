class Solution {
	int maxSubarraySum(int[] arr) {
		// Code here
		int n = arr.length;
		int max = arr[0];
		int bs = arr[0];
		for (int i = 1; i<n; i++) {
			int v1 = bs + arr[i];
			int v2 = arr[i];
			bs = Math.max(v1, v2);
			max = Math.max(max, bs);
		}
		return max;
	}
}
