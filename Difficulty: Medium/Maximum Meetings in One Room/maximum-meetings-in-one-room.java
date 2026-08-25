class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        int n = s.length;
        Data[] data = new Data[n];
        for (int i=0; i<n; i++){
            data[i] = new Data(s[i], f[i], i+1);
        }
        
        Arrays.sort(data, (x, y) -> {
            if (x.end == y.end) return Integer.compare(x.pos, y.pos);
            return Integer.compare(x.end, y.end);
        });
        
        int count = 0;
        int freeTime = -1;
        ArrayList<Integer> result = new ArrayList<>();
        for (Data d: data){
            if (d.start > freeTime){
                count++;
                freeTime = d.end;
                result.add(d.pos);
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
    Data(int start, int end, int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}