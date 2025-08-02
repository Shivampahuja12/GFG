class Solution {
  public:
    void sort012(vector<int>& arr) {
        // code here
        int zero = 0, one = 0, two = 0;
        for (int i=0; i<arr.size(); i++){
            if (arr[i] == 0) zero++;
            else if(arr[i] == 1) one++;
            else two++;
        }
        
        int m = 0;
        for (int i=0; i<zero; i++) arr[m++] = 0;
        for (int i=0; i<one; i++) arr[m++] = 1;
        for (int i=0; i<two; i++) arr[m++] = 2;
    }
};