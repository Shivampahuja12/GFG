class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if (l < r){
            int mid = l + (r-l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    void merge(int[] a, int l, int mid, int r){
        int[] res = new int[r - l + 1];
        int i=l;
        int j=mid+1;
        int k=0;
        while (i <= mid && j <= r){
            if (a[i] <= a[j]){
                res[k++] = a[i++];
            }
            else {
                res[k++] = a[j++];
            }
        }
        while (i <= mid){
            res[k++] = a[i++];
        }
        while (j <= r){
            res[k++] = a[j++];
        }
        
        for (int m = 0; m < res.length; m++){
            a[l + m] = res[m];
        }
        
    }
}