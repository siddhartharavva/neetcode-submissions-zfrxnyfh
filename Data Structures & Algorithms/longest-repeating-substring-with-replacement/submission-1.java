class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character,Integer> c = new HashMap<>();
        int n = s.length();
        int maxval = 0;
        int ans = 0;
        int l = 0;
        for(int r = 0 ; r < n;r++){  
            char val = s.charAt(r);
            c.put(val,c.getOrDefault(val,0)+1);
            if(c.getOrDefault(val,0)>maxval)maxval = c.get(val);
            while(((r-l+1) - maxval)>k ){
                char mval = s.charAt(l);
                c.put(mval,c.getOrDefault(mval,0)-1);
                l++;

            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
