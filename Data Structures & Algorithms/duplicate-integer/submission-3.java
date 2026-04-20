class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet un = new HashSet<>();
        for(int i : nums){
            if(un.contains(i))return true;
            un.add(i);
        }
        return false;
    }
}