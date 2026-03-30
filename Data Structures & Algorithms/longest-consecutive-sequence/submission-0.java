class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        for(int j:nums)set.add(j);
        int longest = 0;
        for(int i:set){
            int curr = i;
            int length = 1;
            if(!set.contains(i-1)){
                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }
                longest = Math.max(longest,length);
            }        
        }
        return longest;
    }
}
