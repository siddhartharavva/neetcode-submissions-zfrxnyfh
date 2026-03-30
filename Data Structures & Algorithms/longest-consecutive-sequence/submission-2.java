class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> max = new HashSet<>();
        for(int i : nums)max.add(i);
        int maxi  = 0;    
        for(int i : nums){
            
            int curr = i;
            int maxl = 1;
            if(!max.contains(curr-1)){
                while(max.contains(curr+1)){
                    curr++;
                    maxl++;
                }                
            }
            maxi = Math.max(maxl,maxi);

       }
       return maxi;


       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
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
