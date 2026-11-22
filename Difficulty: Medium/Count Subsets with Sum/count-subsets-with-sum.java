class Solution {
	static int perfectSum(int[] arr, int target) {
		// code here
		int n = arr.length;
		int[][] t = new int[n + 1][target + 1];
		for (int[] i: t) {
			Arrays.fill(i, -1);
		}
		
		return ss(arr, n - 1, target, t);
	}
	
	static int ss(int[] arr, int n, int target, int[][] t) {
		if (n < 0 && target == 0)
			return 1;
		if (n < 0 && target != 0)
			return 0;
		
		if (t[n][target] != -1)
			return t[n][target];
		
		if (arr[n] <= target) {
			return t[n][target] = ss(arr, n - 1, target - arr[n], t) + ss(arr, n - 1, target, t);
		} else {
			return t[n][target] = ss(arr, n - 1, target, t);
		}
	}
}
