class Solution {
	static void rotateArr(int arr[], int d) {
		int n = arr.length;	
		d = d % n;
		rotate(0, d - 1, arr);
		rotate(d, n - 1, arr);
		rotate(0, n - 1, arr);
	}
	
	static void rotate(int i, int j, int[] a) {
		while (i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
}
