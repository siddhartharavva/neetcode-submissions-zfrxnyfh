class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> h = new HashMap<>();
        for(char c : s.toCharArray())h.put(c,h.getOrDefault(c,0)+1);        
        for(char c : t.toCharArray()){
            if(h.containsKey(c) && h.get(c)>0)h.put(c,h.get(c)-1);                        
            else return false;
            if(h.get(c)==0)h.remove(c);
        }
        return h.isEmpty();
    }
    
}

