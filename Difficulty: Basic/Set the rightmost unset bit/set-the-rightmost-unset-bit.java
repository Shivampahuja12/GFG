// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
        // int i = 0;
        // int idx = -1;
        // while ((1 << i) <= n) {
        //     if ((n & (1 << i)) == 0) {
        //         idx = i;
        //         break;
        //     } else {
        //         i++;
        //     }
        // }
        // if (idx == -1) return n;
        // else {
        //     return (n | (1 << i));
        // }
        
        return n|n+1;
        
    }
}