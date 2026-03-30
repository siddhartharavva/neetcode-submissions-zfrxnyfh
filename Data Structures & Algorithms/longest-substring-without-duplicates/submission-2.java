class Solution {
    public int lengthOfLongestSubstring(String s) {        
        int l = 0;
        HashSet <Character> c = new HashSet<>();
        int maxl = 0;
        int n = s.length();
        for(int r = 0 ; r < n ; r++){
            while(c.contains(s.charAt(r))){
                c.remove(s.charAt(l));
                l++;
            }
            c.add(s.charAt(r));
            maxl = Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}

/*
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}*/