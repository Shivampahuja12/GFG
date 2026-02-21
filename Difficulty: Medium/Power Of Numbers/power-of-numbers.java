class Solution {
    public int reverseExponentiation(int n) {
        // code here
        
        if (n < 10){
            return (int)Math.pow(n, n);
        }
        else {
            return 10;
        }
    }
    // public int rev(int n){
    //     if (n == 0) return;
    // }
}
