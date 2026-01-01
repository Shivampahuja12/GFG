class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        if (n == 0) return new ArrayList<>();
        ArrayList<String> q = new ArrayList<>();
        q.add("1");
        int i = 1;
        int front = 0;
        while (i < n){
            StringBuilder s = new StringBuilder(q.get(front));
            s.append("0");
            i++;
            q.add(s.toString());
            
            if (i==n) break;
            
            StringBuilder sb = new StringBuilder(q.get(front));
            sb.append("1");
            i++;
            q.add(sb.toString());
            
            if (i==n) break;
            
            front++;
        }
     
        return q;   
    }
}
