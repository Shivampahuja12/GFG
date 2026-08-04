class Solution {
    int minCost(int[] height) {
        int[] dp= new int[height.length+1];
        Arrays.fill(dp, -1);
        return frogJump(0, height, dp);
    }
    
    static int frogJump(int i, int[] height, int[] dp){
        int n = height.length;
        if (i == n-1) return 0;

        if (dp[i] != -1){
            return dp[i];
        }
        // jump for (i+1)
        int jump1 = Math.abs(height[i] - height[i+1]) + frogJump(i+1, height, dp);
        // jump for (i+2)
        int jump2 = Integer.MAX_VALUE;
        if (i + 2 < n) {
            jump2 = Math.abs(height[i] - height[i+2]) + frogJump(i+2, height, dp);
        }
        dp[i] = Math.min(jump1, jump2);
        return dp[i];
    }
}