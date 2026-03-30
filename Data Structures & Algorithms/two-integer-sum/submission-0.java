class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> rem = new HashMap<>();
        for(int i = 0; i < nums.length;i++){            
            if(rem.containsKey(nums[i])){                
                return new int[]{rem.get(nums[i]),i};
            }else{                
                rem.put(target-nums[i],i);            
            } 
        }
        return new int[]{-1};
    }
}
