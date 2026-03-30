class Solution {

    private int searchRec(int[] nums, int target, int l, int r) {
        if (l > r) return -1;

        int mid = l + (r - l) / 2;

        if (nums[mid] == target) return mid;

        // Left half is sorted
        if (nums[l] <= nums[mid]) {
            if (nums[l] <= target && target < nums[mid]) {
                return searchRec(nums, target, l, mid - 1);
            } else {
                return searchRec(nums, target, mid + 1, r);
            }
        }
        // Right half is sorted
        else {
            if (nums[mid] < target && target <= nums[r]) {
                return searchRec(nums, target, mid + 1, r);
            } else {
                return searchRec(nums, target, l, mid - 1);
            }
        }
    }

    public int search(int[] nums, int target) {
        return searchRec(nums, target, 0, nums.length - 1);
    }
}