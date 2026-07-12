class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> l = new HashMap<>();
        for(String i : strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!l.containsKey(key))l.put(key, new ArrayList<>());            
            l.get(key).add(i);        
        }
        return new ArrayList<>(l.values());
    }
}
