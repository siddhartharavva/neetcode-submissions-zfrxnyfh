class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res [] = new int[n];
        res[0] = 1;
        for(int i = 1;i < n;i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int suffix = 1;
        for(int j = n-1;j>=0;j--){
            res[j]=res[j]*suffix;
            suffix*=nums[j];
        }
        return res;
        /*int mul = nums[0];
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
        return arr;*/
    }
}  
