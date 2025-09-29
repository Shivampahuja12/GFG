class Solution {
  public:
    int sumOfDigits(int n) {
        // Code here
        if (n%10 == n) return n;
        if (n <= 0) return 0;
        return (n%10) + sumOfDigits(n/10);
        
    }
};