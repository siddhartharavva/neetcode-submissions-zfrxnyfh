class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 ) {return 0;}
        Set <Integer> s = new HashSet<>();
        for(int i : nums)s.add(i);
        int co = 0;
        int max = 0;
        for(int i : nums){
            if(!s.contains(i-1)){
                int c = i;
                while(s.contains(c)){
                    c++;
                    co++;
                }
            }
            max = Math.max(max,co);
            co = 0;
        }
        return max;
    }
}
