class Solution {
    public int[] getConcatenation(int[] nums) {
       int [] ans = new int[2*nums.length];
       int j =0;
       for(int i = 0 ;i < nums.length;i++){
         ans[j++]=nums[i];
       }
       for(int i =0;i < nums.length; i++){
        ans[j++]=nums[i];
       }
       return ans;
    }
}