class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> elem = new HashSet<>();
        int maxL = 0;
        for(int i : nums)elem.add(i);
        for(int i : nums){
            int curr = i;
            int max = 1;
            if(!elem.contains(i-1)){                
                while(elem.contains(curr+1)){
                    max++;
                    curr++;
                }
            }
            maxL = Math.max(max,maxL);
        }
       
       return maxL;
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /* Set <Integer> set = new HashSet<>();
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
        return longest;*/
    }
}
