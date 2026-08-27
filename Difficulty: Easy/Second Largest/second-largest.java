class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            l= Math.max(l, arr[i]);
        }
        int sl = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != l && sl < l) sl = Math.max(sl, arr[i]);
        }
        return sl;
    }
}