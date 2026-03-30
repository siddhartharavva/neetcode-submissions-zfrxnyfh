class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character,Integer> c = new HashMap<>();
        int n = s.length();
        int maxval = 0;
        int ans = 0;
        int l = 0;
        for(int r = 0 ; r < n;r++){            
            c.put(s.charAt(r),c.getOrDefault(s.charAt(r),0)+1);
            if(c.getOrDefault(s.charAt(r),0)>maxval)maxval = c.get(s.charAt(r));
            while(((r-l+1) - maxval)>k ){
                c.put(s.charAt(l),c.getOrDefault(s.charAt(l),0)-1);
                l++;

            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
