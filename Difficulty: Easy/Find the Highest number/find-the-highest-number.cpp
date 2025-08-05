class Solution {
  public:
    int findPeakElement(vector<int>& a) {
        // Code here.
        int n = a.size();
        if (n == 1) return a[0];
        if (a[0] > a[1]) return a[0];
        if (a[n-2] < a[n-1]) return a[n-1];
        
        int lo = 0;
        int hi = n-1;
        int mid;
        
        while (lo<=hi){
            mid = lo+(hi-lo)/2;
            if (a[mid] > a[mid+1] && a[mid] > a[mid-1]){
                return a[mid];
            }
            else if (a[mid] < a[mid+1]){
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        
        return -1;
    }
};
