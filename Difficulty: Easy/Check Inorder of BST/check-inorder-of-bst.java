class Solution {
    public boolean doesRepresentBST(int[] arr) {
        // code here
        for (int i=1; i<arr.length; i++){
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}