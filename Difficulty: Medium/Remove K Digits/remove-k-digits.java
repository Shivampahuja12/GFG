class Solution {
	public String removeKdig(String s, int k) {
		// code here
		int n = s.length();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i<n; i++) {
			char ch = s.charAt(i);
			while (!st.isEmpty() && k>0 && (st.peek() - '0' > ch - '0')) {
				st.pop();
				k--;
			}
			st.push(ch);
		}
		while (k > 0) {
			st.pop();
			k--;
		}
		
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		sb.reverse();
		
		int i = 0;
		while (i < sb.length() && sb.charAt(i) == '0') {
			i++;
		}
		if (i == sb.length())
			return "0";
		else
			return sb.substring(i);
	}
}
