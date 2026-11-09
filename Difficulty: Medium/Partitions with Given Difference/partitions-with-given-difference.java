class Solution {
	public int countPartitions(int[] arr, int diff) {
		// code here
		int sum = 0;
		int n = arr.length;
		for (int i: arr)
			sum += i;
		
		if (sum + diff < 0 || (sum + diff) % 2 != 0)
			return 0;
		
		int target = (sum + diff) / 2;
		
		int[][] t = new int[n + 1][target + 1];
		for (int[] i: t) {
			Arrays.fill(i, -1);
		}
		return count(arr, n - 1, target, t);
	}
	
	public int count(int[] arr, int n, int target, int[][] t) {
		if (n < 0 && target == 0)
			return 1;
		if (n < 0 && target != 0)
			return 0;
		
		if (t[n][target] != -1)
			return t[n][target];
		
		if (arr[n] <= target) {
			return t[n][target] = count(arr, n - 1, target - arr[n], t) + count(arr, n - 1, target, t);
		} else {
			return t[n][target] = count(arr, n - 1, target, t);
		}
	}
}
