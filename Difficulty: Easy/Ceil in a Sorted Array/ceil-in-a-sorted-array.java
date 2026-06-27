class Solution {
	public int findCeil(int[] arr, int x) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid;
		int ans = -1;
		while (lo <= hi) {
			mid = lo + (hi - lo)/2;
			if (arr[mid] >= x) {
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
