class Solution {
  public:
    int countFreq(vector<int>& arr, int target) {
        // code here
        int count = 0;
        int hash[1000001] = {0};
        for (int i=0; i<arr.size(); i++){
            hash[arr[i]]++;
        }
        
        return hash[target];
    }
};
