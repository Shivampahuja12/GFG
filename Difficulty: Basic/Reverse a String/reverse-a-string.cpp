// User function Template for C++
class Solution {
  public:
    string reverseString(string& s) {
        // code here
        int lo = 0;
        int hi = s.size()-1;
        
        while (lo<hi){
            swap(s[lo], s[hi]);
            lo++, hi--;
        }
        
        return s;
    }
};
