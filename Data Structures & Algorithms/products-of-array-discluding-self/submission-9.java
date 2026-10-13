class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        ans[0]=1;
        for(int i = 1 ; i < ans.length;i++)ans[i]=ans[i-1]*nums[i-1];        
        int v = 1;
        for(int i = nums.length-2 ; i>=0;i--){
            v = v*nums[i+1];
            ans[i]*=v;  
        }
        return ans;
    }
}  
