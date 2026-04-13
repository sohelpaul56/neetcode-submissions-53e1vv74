class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            res.computeIfAbsent(key,k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
