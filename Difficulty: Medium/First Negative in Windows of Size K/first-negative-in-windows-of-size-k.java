class Solution {
	static List<Integer> firstNegInt(int arr[], int k) {
		int n = arr.length;
		List<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		int i = 0;
		int j = 0;
		while (j < n) {
		    
			if (arr[j] < 0) {
				q.add(arr[j]);
			}
			
			if (j - i + 1 < k) {
				j++;
			}
			else if (j - i + 1 == k) {
				if (q.isEmpty())
					list.add(0);
				else if (arr[i] == q.peek()) {
					list.add(q.poll());
				}
				else {
				    list.add(q.peek());
				}
				
				j++;
			    i++;
			    

			}
		}
		return list;
	}
}
