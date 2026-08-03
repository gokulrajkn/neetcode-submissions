class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int result = 0;
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i)) &&
            map.get(s.charAt(i)) >= left) {
                left = map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i),i);
            result = Integer.max(i -left +1,result);
        }
        return result;
    }
}
