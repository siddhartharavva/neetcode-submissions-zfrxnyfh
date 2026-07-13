class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> c  = new HashSet<>();
        for(int i : nums)c.add(i);
        int max = 0;
        int  d = 0;
        for(int i : nums){
            int ind = i;
            if(!c.contains(ind-1)){
                while(c.contains(ind)){
                    d++;
                    ind++;
                }
                max = Math.max(d,max);
                d=0;
            }
        }
        return max;
    }
}
