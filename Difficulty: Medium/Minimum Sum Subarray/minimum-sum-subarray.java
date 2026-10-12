class Solution {
	public int minSubarraySum(int[] arr) {
		// code here
		int n = arr.length;
		int max = arr[0];
		int bs = arr[0];
		for (int i = 1; i<n; i++) {
			int v1 = bs + arr[i];
			int v2 = arr[i];
			bs = Math.min(v1, v2);
			max = Math.min(max, bs);
		}
		return max;
	}
}
