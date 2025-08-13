// User function Template for C++
class Solution {
  public:
    int findTarget(vector<int>& arr, int target) {
        // code here
        int lo = 0;
        int hi = arr.size()-1;
        int mid;
        int ans = -1;
        
        while (lo<=hi){
            mid = lo+(hi-lo)/2;
            if (arr[mid] == target){
                ans = mid;
                break;
            }
            if (arr[mid+1] == target){
                ans = mid+1;
                break;
            }
            if (arr[mid-1] == target){
                ans = mid-1;
                break;
            }
            
            if (arr[mid] > target && lo>=0){
                hi = mid-2;
            }
            else if (arr[mid] < target && hi <= arr.size()-1){
                lo = mid+2;
            }
        }
        return ans;
    }
};