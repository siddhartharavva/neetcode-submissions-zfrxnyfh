class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> count = new HashMap<>();
        HashMap <Integer,List<Integer>> ans = new HashMap<>();
        for(int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);                        
        }
        for(int i : count.keySet()){            
            if(ans.containsKey(count.get(i)))ans.get(count.get(i)).add(i);
            else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                ans.put(count.get(i), temp);
            }        
        }
        List<Integer> results = new ArrayList<>();
        for(int f = nums.length; f>0;f--){
            if(ans.containsKey(f)){
                for(int i : ans.get(f)){
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
                
    }
}
