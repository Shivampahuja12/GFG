class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        // boolean[] t = new boolean[n+1];
        return ss(arr, sum, n-1);
    }
    
    static boolean ss(int arr[], int sum, int n){
        if (sum == 0) return true;
        if (n < 0) return false;
        
        if (arr[n] <= sum){
            return ss(arr, sum-arr[n], n-1) || ss(arr, sum, n-1);
        } else {
            return ss(arr, sum, n-1);
        }
    }
}