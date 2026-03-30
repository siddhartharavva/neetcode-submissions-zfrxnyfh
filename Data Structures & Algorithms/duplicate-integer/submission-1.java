class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet dup = new HashSet<>();
        for(int i : nums){
            if(dup.contains(i))return true;
            else dup.add(i);
        }
        return false;
    }
}