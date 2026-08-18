class Solution {
	public String addBinary(String s1, String s2) {
		// code here
		int carry = 0;
		int i = s1.length() - 1;
		int j = s2.length() - 1;
		StringBuilder sb = new StringBuilder();
		while (i >= 0 || j >= 0 || carry == 1) {
			if (i >= 0) carry += s1.charAt(i) - '0';
			if (j >= 0) carry += s2.charAt(j) - '0';
			i--; j--;
			sb.append(carry % 2);
			carry /= 2;
		}
		return sb.reverse().toString().replaceFirst("^0+(?!$)", "");
	}
}
