class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = nums[0];
        int f= 0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=0)mul = mul*nums[i];
            else f =f+ 1;
        }
        int arr [] = new int[nums.length];
        for(int i = 0; i < arr.length;i++){
            if(f>1)arr[i]= 0;
            else if(nums[i]!=0 && f==1)arr[i] = 0;
            else if(nums[i]==0) arr[i]= mul;
            else arr[i] = mul/nums[i];


        }
        return arr;
    }
}  
