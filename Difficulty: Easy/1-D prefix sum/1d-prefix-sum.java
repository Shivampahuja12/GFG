class Solution {
	public ArrayList<Integer> prefSum(int[] arr) {
		// code here
		ArrayList<Integer> prefix = new ArrayList<>(arr.length);
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
			prefix.add(sum);
		}
		return prefix;
	}
}
