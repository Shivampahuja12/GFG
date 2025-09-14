// User function Template for C++
class Solution {
  public:
    int findCeil(vector<int>& arr, int x) {
        // brute
        
        int i = 0;
        int n = arr.size();
        while (i<n){
            if (arr[i] >= x){
                return i;
            }
            i++;
        }
        return -1;
            
    }
};