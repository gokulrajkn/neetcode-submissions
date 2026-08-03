class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n==1) return cost[0];
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0, cost[0]);
        map.put(1, cost[1]);
        return Integer.min(result(n-1,cost,map),result(n-2,cost,map));
    }
    public int result(int n, int[] cost, Map<Integer,Integer> map) {
        if(n == 0 || n==1) return cost[n];
        if(!map.containsKey(n))
        map.put(n, cost[n]+Integer.min(result(n-1,cost,map),result(n-2,cost,map)));
        return map.get(n);
    }
}
