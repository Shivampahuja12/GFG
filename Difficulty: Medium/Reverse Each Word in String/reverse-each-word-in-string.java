class Solution {
	public String reverseWords(String s) {
		// Code here
		String[] words = s.trim().replaceAll("\\s+", " ").split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<words.length; i++) {
			StringBuilder in = new StringBuilder(words[i]);
			sb.append(in.reverse());
			if (i != words.length - 1)
				sb.append(" ");
		}
		return sb.toString();
	}
}
