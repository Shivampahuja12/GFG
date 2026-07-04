class Solution {
	public int findKRotation(int arr[]) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid;
		while (lo <= hi) {
			mid = lo + (hi - lo)/2;
			if (lo == hi)
				return lo;
			if (arr[mid] < arr[hi]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}
