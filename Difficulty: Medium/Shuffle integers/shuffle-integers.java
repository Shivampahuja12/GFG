// User function Template for Java

class Solution {
    void shuffleArray(long arr[], int n) {
        // Your code goes here
        
        long[] a = Arrays.copyOf(arr, arr.length);
// 		System.out.println(Arrays.toString(a));
        int k = 0;
        for (int i=0; i<n/2; i++){
            arr[k++] = a[i]; 
            arr[k++] = a[i+(n/2)];
        }
    }
}
