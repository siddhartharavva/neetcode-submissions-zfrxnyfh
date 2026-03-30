class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        bt(nums,used,new ArrayList<>(),ans);
        return ans;
    }

    private void bt(int [] nums, boolean [] used , List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length;i++){
            if(used[i])continue;
            curr.add(nums[i]);
            used[i]= true;
            bt(nums,used,curr,ans);
            used[i]= false;
            curr.remove(curr.size()-1);
        }

    }
}
