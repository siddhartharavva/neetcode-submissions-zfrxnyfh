class Solution {

    private int searchRec(int[] nums, int target, int l, int r) {
        if(l>r)return -1;
        int mid = l + (r-l)/2;
        if(nums[mid]==target)return mid;
        if(nums[l]<=nums[mid]){
            if(nums[l]<=target && nums[mid]>target)return searchRec(nums,target,l,mid-1);
            else return searchRec(nums,target,mid+1,r);
        }else{
            if(nums[mid]<target && nums[r]>=target)return searchRec(nums,target,mid+1,r);
            else return searchRec(nums,target,l,mid-1);

        }
    }
      

    public int search(int[] nums, int target) {
        return searchRec(nums, target, 0, nums.length - 1);
    }
}