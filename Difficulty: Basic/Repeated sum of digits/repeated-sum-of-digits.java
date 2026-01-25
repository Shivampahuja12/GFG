// User function Template for Java
class Solution {
    static int repeatedSumOfDigits(int n) {
        // code here
        int ans = digitalRootSum(n);
        int res = 0;
        if (ans>9){
            res =  loop(ans);
        }
        else res = ans;
        return res;
    }
    static int loop(int n){
        if(n > 9) {
            n = digitalRootSum(n);
        }
        else return n;
        return loop(n);

    }
    static int digitalRootSum(int n){
        if (n == 0) return 0;
        return n%10 + digitalRootSum(n/10);

    }
}
