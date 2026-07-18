class Solution {
	public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
		int n = arr.length;
		int left = 0;
		int right = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> ans = new ArrayList<>();
		int m = 0;
		while (right < n) {
			while (!deque.isEmpty() && deque.peekLast() < arr[right]) {
				deque.pollLast();
			}
			deque.addLast(arr[right]);
			
			if (right - left + 1 < k) {
				right++;
			}
			
			else if (right - left + 1 == k) {
				ans.add(deque.peekFirst());
				
				if (deque.peekFirst() == arr[left]) {
					deque.pollFirst();
				}
				
				left++;
				right++;
			}
		}
		return ans;
	}
}
