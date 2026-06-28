class Solution {
	int countFreq(int[] arr, int target) {
		// code here
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i<arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		Integer ans = map.get(target);
		return (ans != null) ? ans : 0;
	}
}
