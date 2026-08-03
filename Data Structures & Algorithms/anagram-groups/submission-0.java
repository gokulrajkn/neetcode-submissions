class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int m = strs.length;
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<m;i++) {
            int[] arr = new int[26];
            String s = strs[i];
            for(int j=0;j<s.length();j++) {
                arr[s.charAt(j)-'a']++;
            }
            //convert to string 
            String cnts = "";
            for(int j=0;j<26;j++) {
                if(arr[j] > 0) {
                    cnts = cnts + ('a'+j) + arr[j]; 
                }
            }
            if(map.containsKey(cnts)) {
                map.get(cnts).add(s);
            } else {
                List <String> list = new ArrayList<>();
                list.add(s);
                map.put(cnts,list);
            }
        }
        return map.values().stream().toList();
    }
}
