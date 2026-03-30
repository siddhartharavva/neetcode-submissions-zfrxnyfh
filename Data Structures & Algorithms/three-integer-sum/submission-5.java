class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        Arrays.sort(nums);        
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                int val = nums[l]+nums[r]+ nums[i];
                if(val<0)l++;
                if(val>0)r--;
                if(val==0){                              
                    ans.add( Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l<r && nums[l]==nums[l+1])l++;
                    while(l<r && nums[r]==nums[r-1])r--;
                    l++;
                    r--;
                }
            }            
        }
        return ans;
























      /*  Arrays.sort(nums);
        List<List<Integer>>  ans = new ArrayList<>();
        for(int i =0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length-1;
            while(j<k){      
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    List <Integer> temp = new ArrayList<>();
                    temp.add(nums[j]);
                    temp.add(nums[i]);                   
                    temp.add(nums[k]);
                    ans.add(temp);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else k--;
                
            }
        }
        return ans;


        */
    }
}