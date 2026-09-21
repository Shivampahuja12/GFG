class Solution {
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		int n = arr.length;
		int left = 0;
		int right = 0;
		int sum = 0;
		while (right < n) {
			sum += arr[right];
			if (sum < target) {
				right++;
			} else if (sum == target) {
				list.add(left + 1);
				list.add(right + 1);
				return list;
			} else {
				while (sum > target && left <= right) {
					sum -= arr[left];
					left++;
				}
				if (sum == target) {
					list.add(left + 1);
					list.add(right + 1);
					return list;
				}
				right++;
			}
		}
		if (list.isEmpty()) {
			list.add(-1);
		}
		return list;
	}
}
