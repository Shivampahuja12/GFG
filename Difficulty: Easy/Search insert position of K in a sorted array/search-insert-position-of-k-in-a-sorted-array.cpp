class Solution {
  public:
    int searchInsertK(vector<int> &arr, int k) {
        // code here
        int lo = 0;
        int hi = arr.size()-1;
        int mid;
        int ans = -1;
        while (lo <= hi){
            mid = lo + (hi-lo)/2;
            
            if (arr[mid] == k){
                return mid;
            }
            else if (arr[mid] < k){
                ans = mid;
                lo = mid + 1;
            } 
            else {
                hi = mid -1;
            }
        }
        return ans+1;
    }
};