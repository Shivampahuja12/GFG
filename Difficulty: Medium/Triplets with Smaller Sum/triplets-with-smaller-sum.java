class Solution {
	int countTriplets(int sum, int arr[]) {
		// code here
		Arrays.sort(arr);
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			int j = i + 1;
			int k = n - 1;
			while (j<k) {
				int currSum = arr[i] + arr[j] + arr[k];
				if (currSum < sum) {
					count += k - j;
					j++;
				}
				else {
					k--;
				}
			}
		}
		return count;
	}
}
