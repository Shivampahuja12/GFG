class Solution {
	public List<String> powerSet(String s) {
		// Code here
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		set(0, list, s, sb);
		Collections.sort(list);
		return list;
	}
	
	void set(int i, List<String> list, String s, StringBuilder sb) {
		if (i >= s.length()) {
			list.add(sb.toString());
			return;
		}
		
		sb.append(s.charAt(i));
		set(i + 1, list, s, sb);
		sb.deleteCharAt(sb.length() - 1);
		set(i + 1, list, s, sb);
	}
}
