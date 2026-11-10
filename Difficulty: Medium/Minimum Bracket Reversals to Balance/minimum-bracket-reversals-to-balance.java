class Solution {
	public int countMinReversals(String s) {
		// code here
		int n = s.length();
		if (n % 2 != 0)	return - 1;
		int open = 0;
		int close = 0;
		for (int i = 0; i<n; i++) {
			char ch = s.charAt(i);
			if (ch == '{') {
				open++;
			} else {
				if (open > 0) {
					open--;
				} else {
					close++;
				}
			}
		}
		return (open + 1)/2 + (close + 1)/2;
	}
}
