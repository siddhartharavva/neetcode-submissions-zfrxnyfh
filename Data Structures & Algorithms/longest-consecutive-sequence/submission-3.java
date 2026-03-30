class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> map = new HashSet<>();
        for(int i : nums)map.add(i);
        int maxl = 0;
        for(int i : nums){
            int curr = i;
            int max = 1;
            if(!map.contains(curr-1)){
                while(map.contains(curr+1)){
                    curr++;
                    max++;
                }
                maxl =  Math.max(maxl,max);
            }
        }
        return maxl;


       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        /* HashSet <Integer> un = new HashSet<>();
       for(int i : nums)un.add(i);
       int maxL = 0;
       for(int i : nums){
        int curr = i;
        int max = 1;
        if(!un.contains(curr-1)){
            while(un.contains(curr+1)){
                curr++;
                max++;
            }
        }
        maxL = Math.max(maxL,max);
    
       }
       return maxL;


       */
       
        
    }
}
