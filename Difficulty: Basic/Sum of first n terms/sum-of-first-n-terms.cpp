// User function template for C++

class Solution {
  public:
    int sumOfSeries(int n) {
        // code here
        int sum = 0;
        for (int i=1; i<=n; i++){
            int cube = i*i*i;
            sum += cube;
        }
        
        return sum;
    }
};