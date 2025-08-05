class Solution {
  public:
    int floorSqrt(int n) {
        // code here
        
        if (n==0 || n==1) return 1;
        
        int lo = 0;
        int hi = n;
        int mid;
        int ans;
        
        while (lo<=hi) {
            mid =lo + (hi-lo)/2;
            if (mid*mid<=n) {
                ans = mid;
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return ans;
    }
};