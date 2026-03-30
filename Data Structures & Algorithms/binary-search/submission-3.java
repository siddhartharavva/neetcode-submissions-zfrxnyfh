class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid=-1 ;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] == target)return mid;
            if(nums[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }
}

























/*class Solution {
    public int bs(int[] nums , int l , int r,int target){
        if(l>r)return -1;
        int mid = l+(r-l)/2;
        if(target==nums[mid]){
            return mid;
        }else if (target>nums[mid]){
            return bs(nums,mid+1,r,target);
        }else{ 
            return bs(nums,l,mid-1,target);
        }
    }
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
}
*/