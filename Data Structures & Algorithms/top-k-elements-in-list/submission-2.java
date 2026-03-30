class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,List<Integer>> freqkey = new HashMap<>();
        for(int i:nums)freq.put(i,freq.getOrDefault(i,0)+1);
        for(int i : freq.keySet()){
            if(!freqkey.containsKey(freq.get(i))){
            List<Integer> templ = new ArrayList<>();
            templ.add(i);
            freqkey.put(freq.get(i),templ);
            }else freqkey.get(freq.get(i)).add(i);
        }
        int i = 0;
        int f = nums.length;
        int [] ans = new int[k];
        while(i<k){
            if(!freqkey.containsKey(f))f--;
            else{
                for(int j:freqkey.get(f)){
                    ans[i]=j;
                    i++;
                    if(i==k)return ans;
                }
                f--;
                
            }
            
        }
        return ans;

            

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*HashMap <Integer,Integer> count = new HashMap<>();
        HashMap <Integer,List<Integer>> buckets = new HashMap<>();
        for(int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);                        
        }
        for(int i : count.keySet()){            
            if(buckets.containsKey(count.get(i)))buckets.get(count.get(i)).add(i);
            else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                buckets.put(count.get(i), temp);
            }        
        }
        List<Integer> results = new ArrayList<>();
        for(int f = nums.length; f>0 && results.size() < k;f--){
            if(buckets.containsKey(f)){
                for(int i : buckets.get(f)){
                    results.add(i);
                    if(results.size()==k)break;
                }                
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = results.get(i);
        }
        return res;
              */  
    }
}
