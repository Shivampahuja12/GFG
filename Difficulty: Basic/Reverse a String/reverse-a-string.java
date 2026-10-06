class Solution {
	public static String reverseString(String s) {
		// code here
		String str = "";
		return rev(str, s, 0);
	}
	public static String rev(String str, String s, int i) {
		if (i == s.length())
			return str;
		return rev(str, s, i + 1) + s.charAt(i);
	}
}
