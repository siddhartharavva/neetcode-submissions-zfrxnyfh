class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        bt(0,nums,new ArrayList<>(),ans);
        return ans;
    }

    private void bt(int st,int[] nums ,List<Integer> curr, List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));

        for(int i = st ; i < nums.length;i++){
            if (i > st && nums[i] == nums[i - 1]) continue;
            curr.add(nums[i]);
            bt(i+1,nums,curr,ans);
            curr.remove(curr.size()-1);
        }
        

    }
}
