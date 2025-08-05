class Solution {
  public:
    int peakElement(vector<int> &arr) {
        // code here
        
        // if size is 1 then it will return the 0th index
        if (arr.size() == 1) return 0;
        
        // if the first element is greater than the second it will return 
        // 0th index because if it is decreasing from the starting then the
        // first element will always be the peak element
        if (arr[0] > arr[1]) return 0;
        
        
        // it will return the last element
        if (arr[arr.size()-2] < arr[arr.size()-1]) return arr.size()-1;
        
        int lo = 0;
        int hi = arr.size()-1;
        int mid;
        
        while (lo<=hi){
            mid = lo+(hi-lo)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if (arr[mid] < arr[mid+1]) lo = mid+1;
            else hi = mid-1;
        }
        return -1;
    }
};
