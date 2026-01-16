class Solution {
    public String reverseWords(String s) {
        // Code here
        // StringBuilder sb = new StringBuilder(s);
        
        
        s = s.replaceAll("\\.", " ");
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        // sb.setLength(0);
        // sb.append(s);
        s = s.replaceAll(" ", ".");
        // sb.setLength(0);
        
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\.");
        for (int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if (i!=0) sb.append(".");
        }
        return sb.toString();
    }
}
