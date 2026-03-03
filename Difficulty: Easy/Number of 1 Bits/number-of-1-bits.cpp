class Solution {
  public:
    int setBits(int n) {
        // Write Your Code here
        int count = 0;
        int i = 0;
        while (n > 0){
            if (((n >> i) & 1) == 1) count++;
            n/=2;
        }
        return count;
    }
};