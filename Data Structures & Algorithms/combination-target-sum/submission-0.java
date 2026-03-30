class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(0,nums,target,new ArrayList<>(),ans);
        return ans;
     
    }

    private void bt(int st, int [] nums , int target , List<Integer> arr,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList(arr));
            return;
        }
        if (target<0)return;

        for(int i =st;i< nums.length;i++ ){
            arr.add(nums[i]);
            bt(i,nums,target-nums[i],arr,ans);
            arr.remove(arr.size()-1);
        }
    }
}
