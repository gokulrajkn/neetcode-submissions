class Solution {
    public int splitArray(int[] nums, int k) {
        int high = 0;
        int low = 0;
        for (int i = 0; i < nums.length; i++) {
            low = Integer.max(low, nums[i]);
            high += nums[i];
        }
        int res = 0;
        while(low <= high) {
            int mid = low + ((high - low)/2);
            if(canFit(nums,k,mid)) {
                res = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    public boolean canFit(int[] nums, int k, int mid) {
        int cursum = 0;
        int size = 1;
        for (int i = 0; i < nums.length; i++) {
            if (cursum + nums[i] > mid) {
                size++;
                cursum = 0;
            }
            cursum += nums[i];
        }
        return size <= k;
    }
}