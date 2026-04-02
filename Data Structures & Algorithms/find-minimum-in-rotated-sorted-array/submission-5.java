class Solution {    
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid = l + (r-l)/2;            
            if(nums[mid]>nums[r])l = mid+1;
            else r = mid;            
        }
        return nums[l];
    }
}

























/*class Solution {
    int binser(int [] nums , int l , int r){
        if(nums[l]<=nums[r])return nums[l];
        int mid = l+(r-l)/2;
        if(nums[r]<nums[mid]){            
            
            return binser(nums,mid+1,r);
        }else{
            
            return binser(nums,l,mid);
        }
    }
    public int findMin(int[] nums) {
        return binser(nums,0,nums.length-1);
    }
}
*/