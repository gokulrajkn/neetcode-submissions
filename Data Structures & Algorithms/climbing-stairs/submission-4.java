class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map= new HashMap<>();
        map.put(-1,0);
        map.put(0,1);
        return result(n,map);
    }
    public int result(int n, Map<Integer,Integer> map) {
        if(!map.containsKey(n)) {
            map.put(n,result(n-1,map)+result(n-2,map));
        }
        return map.get(n);
    }
}