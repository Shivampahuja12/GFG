class Solution {
	int search(String pat, String txt) {
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		int len = pat.length();
		int count = 0;
		for (int i = 0; i<len; i++) {
			char ch = pat.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		
		int left = 0;
		int right = 0;
		while (right < txt.length()) {
			char ch = txt.charAt(right);
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
			
			if (right - left + 1 < len) {
				right++;
			}
			
			else if (right - left + 1 == len) {
				if (map1.equals(map2)) {
					count++;
				}
				char leftChar = txt.charAt(left);
				int leftCount = map2.get(leftChar) - 1;
				
				if (leftCount == 0) {
					map2.remove(leftChar);
				} else {
					map2.put(leftChar, leftCount);
				}
				left++;
				right++;
			}
			
		}
		
		return count;
	}
}
