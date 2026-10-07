class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		// Code here
		int n = arr.length;
		int left = 0;
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i<k; i++) {
			sum += arr[i];
		}
		if (sum > maxSum) {
			maxSum = sum;
		}
		for (int right = k; right < n; right++) {
			sum = sum - arr[left] + arr[right];
			if (sum > maxSum) {
				maxSum = sum;
			}
			left++;
		}
		return maxSum;
	}
}
