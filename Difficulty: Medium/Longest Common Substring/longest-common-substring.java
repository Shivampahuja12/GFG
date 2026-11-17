class Solution {
	int maxLen = 0;
	public int longCommSubstr(String s1, String s2) {
		// code here
		int n = s1.length();
		int m = s2.length();
		int[][] t = new int[n + 1][m + 1];
		for (int[] i: t) {
			Arrays.fill(i, -1);
		}
		commonSubstring(s1, s2, n, m, t);
		return maxLen;
	}
	public int commonSubstring(String s1, String s2, int n, int m, int[][] t) {
		if (n == 0 || m == 0) {
			return 0;
		}
		if (t[n][m] != -1) return t[n][m];
		if (s1.charAt(n-1) == s2.charAt(m-1)) {
			t[n][m] = 1 + commonSubstring(s1, s2, n - 1, m - 1, t);
			maxLen = Math.max(maxLen, t[n][m]);
		} else {
			t[n][m] = 0;
		}
		
		commonSubstring(s1, s2, n - 1, m, t);
		commonSubstring(s1, s2, n, m - 1, t);
		
		return t[n][m];
	}
}
