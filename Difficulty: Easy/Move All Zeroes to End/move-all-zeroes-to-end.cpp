class Solution {
  public:
    void pushZerosToEnd(vector<int>& arr) {
        // code here
        int z = 0;
        int nz = 0;
        vector<int> temp;
        
        for (int i=0; i<arr.size(); i++){
            if (arr[i] == 0) z++;
            else temp.push_back(arr[i]);
        }
        
        
        
        for (int i=temp.size(); i<arr.size(); i++){
            temp.push_back(0);
        }
        
        for (int i=0; i<arr.size(); i++){
            arr[i] = temp[i];
        }
    }
};