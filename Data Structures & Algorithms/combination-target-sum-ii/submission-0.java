class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        bt(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    private void bt(int st , int [] nums , int tr, List<Integer> curr,List<List<Integer>>ans){
        if(tr==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (tr<0)return;
        for(int i = st; i < nums.length;i++){
            if (i > st && nums[i] == nums[i - 1]) continue;
            if (nums[i] > tr) break;

            curr.add(nums[i]);

            bt(i+1,nums,tr-nums[i],curr,ans);
            curr.remove(curr.size()-1 );
        }

    }
}
