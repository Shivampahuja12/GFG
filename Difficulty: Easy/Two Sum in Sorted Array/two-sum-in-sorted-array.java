class Solution {
	public ArrayList<Integer> twoSum(int[] arr, int target) {
		// code here
		ArrayList<Integer> result = new ArrayList<>();
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int sum = arr[i] + arr[j];
			if (sum == target) {
				result.add(i + 1);
				result.add(j + 1);
				break;
			}
			else if (sum > target) {
				j--;
			}
			else {
				i++;
			}
		}
		if (result.isEmpty()) {
		    result.add(-1);
		    result.add(-1);
		}
		return result;
	}
}
