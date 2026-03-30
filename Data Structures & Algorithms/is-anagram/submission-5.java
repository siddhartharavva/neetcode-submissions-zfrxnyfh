class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> freq = new HashMap<>();
        if (s.length() != t.length()) return false;
        for(char sc : s.toCharArray()){
            freq.put(sc,freq.getOrDefault(sc,0)+1);
        }

        for(char tc : t.toCharArray()){
            Integer v= freq.get(tc);
            if( v == null || v==0)return false;
            else freq.put(tc,v-1);
        }        
        return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*HashMap <Character,Integer> count = new HashMap<>();
        if(s.length()!=t.length())return false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0 ; i < t.length();i++){
            Character ch = t.charAt(i);
            Integer freq = count.get(ch);
            if(freq==null || freq==0)    return false;     
            else count.put(ch,freq-1);                               
        }
        return true;*/
    }
}