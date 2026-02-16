class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if (n == 0) return false;
        if (n == 1) return true;
        while (n!=1){
            if (n%2 == 1) return false;
            n/=2;
        }
        return true;
    }
}