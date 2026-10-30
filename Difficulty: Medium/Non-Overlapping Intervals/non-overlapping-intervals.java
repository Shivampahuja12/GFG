class Solution {
	public int minRemoval(int intervals[][]) {
		// code here
		int n = intervals.length;
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
		int prevEnd = intervals[0][1];
		int count = 0;
		for (int i = 1; i<intervals.length; i++) {
			if (intervals[i][0] >= prevEnd) {
				prevEnd = intervals[i][1];
			} else {
				count++;
			}
		}
		return count;
	}
}
