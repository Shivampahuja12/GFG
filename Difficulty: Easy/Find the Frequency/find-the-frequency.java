class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        int ans = 0;
        
    
        for (int i=0; i<arr.length; i++){
            
            boolean seen = false;
            for (int k=0; k<i; k++){
                if (arr[i] == arr[k]){
                    seen = true;
                    break;
                }
            }
            
            if (seen) continue;
            
            int count = 1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            
            if (x == arr[i]){
                ans = count;
                break;
            }
        }
        return ans;
    }
}