class Solution {
	static boolean isSubsetSum(int arr[], int sum) {
		// code here
		int n = arr.length;
		return ss(arr, n-1, sum);
	}
	static boolean ss(int[] arr, int n, int sum) {
	    if (sum == 0)
			return true;
		if (n < 0)
			return false;
		
		if (arr[n] <= sum) {
			return ss(arr, n - 1, sum - arr[n]) || ss(arr, n - 1, sum);
		} else {
			return ss(arr, n - 1, sum);
		}
	}
}
