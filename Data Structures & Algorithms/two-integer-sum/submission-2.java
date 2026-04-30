class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> res = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(res.containsKey(nums[i]))return new int []{res.get(nums[i]),i};
             res.put(target-nums[i],i);
        }
        return new int [] {-1};
    }
}

     /*   HashMap <Integer,Integer> set = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            if(set.containsKey(nums[i]))return new int[] {set.get(nums[i]),i};
            else set.put(target-nums[i],i);
        }
        return new int[]{1};
    }*/

