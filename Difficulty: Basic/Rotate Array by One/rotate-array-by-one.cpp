// User function Template for C++

class Solution {
  public:
    void rotate(vector<int> &arr) {
        // code here
        int last = arr[arr.size()-1];
        for (int i=0; i<arr.size()-1; i++){
            arr[arr.size()-i-1] = arr[arr.size()-i-2];
        }
        arr[0] = last;
    }
};