class Solution {
	static List<Integer> firstNegInt(int arr[], int k) {
	    
		List<Integer> ans = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		
		for (int i = 0; i<arr.length; i++) {
			
			// Store index of negative numbers
			if (arr[i] < 0) q.add(i);
			
			// Window starts after reaching size k
			if (i >= k - 1) {
				
				// Remove indices outside current window
				while (!q.isEmpty() && q.peek() < i - k + 1) {
					q.poll();
				}
				
				if (q.isEmpty()) ans.add(0);
				else ans.add(arr[q.peek()]);
			}
		}
		return ans;
	}
}
