class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int result = 0;
        if(n > 2) {
            nums[2] = nums[0] + nums[2];
        }
        for(int i=3;i<n;i++) {
            nums[i]=nums[i] + Integer.max(nums[i-2],nums[i-3]);
        }
        for(int i=0;i<n;i++) {
            result = Integer.max(result, nums[i]);
        }
        return result;
    }
}
