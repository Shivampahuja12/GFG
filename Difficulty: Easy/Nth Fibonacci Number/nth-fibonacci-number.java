class Solution {
	static int nthFibonacci(int n) {
		// code here
		int f0 = 0;
		int f1 = 1;
		int f = 0;
		if (n == 0) return f0;
		if (n == 1) return f1;
		for (int i = 2; i <= n; i++) {
			f = f0 + f1;
			f0 = f1;
			f1 = f;
		}
		return f;
	}
}
