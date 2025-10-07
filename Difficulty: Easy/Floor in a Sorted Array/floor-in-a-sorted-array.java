class Solution {
    public int findFloor(int[] arr, int x) {
        
        
        // brute 
        if (x < arr[0])
            return -1;
        if (x > arr[arr.length - 1])
            return arr.length - 1;

        int ans=-1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] <= x){
                ans = i;
            }
            else break;
        }

        return ans;
        
    }
}
