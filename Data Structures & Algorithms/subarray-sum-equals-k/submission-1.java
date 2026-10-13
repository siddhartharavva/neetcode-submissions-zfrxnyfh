class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> s = new HashMap<>();
        int sum = 0;
        int c = 0;
        s.put(0,1);
        for(int i : nums){
            sum+=i;
            if(s.containsKey(sum-k))c+=s.get(sum-k);
            s.put(sum,s.getOrDefault(sum,0)+1);
        }
        return c;

    }
}