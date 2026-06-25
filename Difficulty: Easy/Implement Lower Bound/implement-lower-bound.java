class Solution {
	int lowerBound(int[] arr, int target) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid;
		int ans = arr.length;
		while (lo <= hi) {
			mid = lo + (hi - lo)/2;
			if (arr[mid] >= target) {
				ans = mid;
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		}
		return ans;
	}
}
