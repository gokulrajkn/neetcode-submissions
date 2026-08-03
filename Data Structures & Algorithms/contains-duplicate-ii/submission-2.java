class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        // Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            if(!set.add(nums[i])) return true;
            if(i >= k) set.remove(nums[i-k]);
        }
        return false;
    }
}