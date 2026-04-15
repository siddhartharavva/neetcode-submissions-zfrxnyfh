class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        HashMap <Character,Integer> need = new HashMap<>();
        HashMap <Character,Integer> window = new HashMap<>();
        for(Character c : t.toCharArray())need.put(c,need.getOrDefault(c,0)+1);
        int formed = 0;        
        int minL = Integer.MAX_VALUE;
        int  l = 0;
        int req = need.size();
        int minS = 0;
        for(int r = 0 ; r < s.length();r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(need.containsKey(c) && window.get(c)==need.get(c)){
                formed++;
            }
            while(l<=r && formed == req){
                if(r-l+1<minL){
                    minL = r-l+1;
                    minS = l;
                }
                char lC = s.charAt(l);
                window.put(lC,window.get(lC)-1);
                if(need.containsKey(lC) && window.get(lC)<need.get(lC))formed--;
                l++;
            }
        }
        return minL == Integer.MAX_VALUE ? "" : s.substring(minS,minS+minL);

    }
}



/*class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray())need.put(c, need.getOrDefault(c, 0) + 1);        
        int required = need.size();
        int formed = 0;
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for(int r = 0 ; r < s.length();r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) &&
                window.get(c) == need.get(c)) {
                formed++;
            }        
            while (l <= r && formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }
                l++;
            }
            
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}*/