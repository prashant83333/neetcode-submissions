class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char []arr=s.toCharArray();
            Arrays.sort(arr);
            String k=new String(arr);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
