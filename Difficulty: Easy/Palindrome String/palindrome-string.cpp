class Solution {
  public:
    bool isPalindrome(string& s) {
        // code here
        int lo = 0;
        int hi = s.size()-1;
        
        while (lo<hi){
            if (s[lo] != s[hi]){
                return false;
            }
            lo++, hi--;
        }
        return true;
    }
};