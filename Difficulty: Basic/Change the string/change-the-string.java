// User function Template for Java

class Solution {
    String modify(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(0) >= 'A' && s.charAt(0) <='Z'){
                flag = false;
            }
            else if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
                flag = true;
            }
        }
        
        for (int i=0; i<s.length(); i++){
            if (flag) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            else {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        
        return sb.toString();
    }
}