class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList <List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;    
            int l = i+1;
            int r = nums.length-1;            
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));                
                    sum = nums[i];
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }else if (sum>0)r--;
                else l++;
            }

        }
        return ans;
        
    }
}
