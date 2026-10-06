class Solution {
	static ArrayList<Integer> nextSmallerEle(int[] arr) {
		// code here
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>(n);
		st.push(arr[n - 1]);
		list.add(-1);
		for (int i = n - 2; i >= 0; i--) {
			while (!st.isEmpty() && st.peek() >= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) list.addFirst(-1);
			else list.addFirst(st.peek());
			st.push(arr[i]);
		}
		return list;
	}
}
