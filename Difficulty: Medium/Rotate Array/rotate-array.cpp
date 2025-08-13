class Solution {
  public:

    // Function to rotate an array by d elements in counter-clockwise direction.
    void rotate(vector<int> &a, int lo, int hi){
        while (lo<hi){
            swap(a[lo], a[hi]);
            lo++, hi--;
        }
    }
    void rotateArr(vector<int>& arr, int d) {
        // code here
        int n = arr.size();
        d = d%n;
        rotate(arr, 0, d-1);
        rotate(arr, d, n-1);
        rotate(arr, 0, n-1);
    }
};