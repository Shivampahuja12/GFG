class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for (int i=1; i<arr.length; i++){
            int prev = i-1;
            int curr = arr[i];
            while (prev >= 0 && curr < arr[prev]){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
}