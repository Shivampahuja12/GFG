class Solution {
	String to_upper(String str) {
		// code here
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i<sb.length(); i++) {
			char ch = sb.charAt(i);
			if (ch >= 97 && ch <= 122) {
				sb.setCharAt(i, (char) (ch - 32));
			}
		}
		return sb.toString();
	}
}
