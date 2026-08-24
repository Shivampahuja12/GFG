class Solution {
	public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
		
		return func(s, f, s.length);
	}
	public ArrayList<Integer> func(int[] s, int[] f, int n) {
		
		Data[] a = new Data[n];
		
		// Store start, end and original position
		for (int i = 0; i < n; i++) {
			a[i] = new Data(s[i], f[i], i + 1);
		}
		
		// Sort meetings according to ending time
		Arrays.sort(a, (x, y) -> {
			if (x.end == y.end) {
				return Integer.compare(x.pos, y.pos);
			}
			return Integer.compare(x.end, y.end);
		});
		
		int count = 0;
		int lastEndTime = -1;
		ArrayList<Integer> result = new ArrayList<>();
		for (Data meeting : a) {
			// Meeting can be selected if it starts
			// after the previous meeting has ended
			if (meeting.start > lastEndTime) {
				count++;
				lastEndTime = meeting.end;
				result.add(meeting.pos);
			}
		}
		
		Collections.sort(result);

		return result;
	}
}

class Data {
	int start;
	int end;
	int pos;
	Data(int start, int end, int pos) {
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}
