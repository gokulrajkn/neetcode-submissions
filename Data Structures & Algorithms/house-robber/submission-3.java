class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[n];
        int result = 0;
        dp[0] = nums[0];
        if(n > 1) {
            dp[1] = nums[1];
        }
        if(n > 2) {
            dp[2] = dp[0] + nums[2];
        }
        for(int i=3;i<n;i++) {
            dp[i]=nums[i] + Integer.max(dp[i-2],dp[i-3]);
        }
        for(int i=0;i<n;i++) {
            result = Integer.max(result, dp[i]);
        }
        return result;
    }
}
