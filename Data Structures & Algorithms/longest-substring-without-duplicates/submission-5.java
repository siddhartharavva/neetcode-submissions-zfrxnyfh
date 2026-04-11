class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        HashSet <Character> un = new HashSet<>();
        for(int r = 0; r < s.length();r++){
            while(un.contains(s.charAt(r))){
                un.remove(s.charAt(l));
                l++;
            }
            un.add(s.charAt(r));     
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}











/*class Solution {
    public int lengthOfLongestSubstring(String s) { 
        int l = 0;
        HashSet <Character> c  = new HashSet<>();
        int maxl = 0;
        for(int r = 0;r < s.length();r++){
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
*/