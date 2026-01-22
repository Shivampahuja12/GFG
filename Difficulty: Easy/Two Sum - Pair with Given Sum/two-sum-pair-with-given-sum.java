class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        if (arr.length < 2) return false;
        
        int i=0;
        int j = arr.length-1;
        Arrays.sort(arr);
        while (i < j){
            if (arr[i] + arr[j] == target){
                return true;
            }
            else if (arr[i] + arr[j] > target){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
}