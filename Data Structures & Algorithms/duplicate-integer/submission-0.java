class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> unique = new HashSet<>();
        for(int i:nums){
            if(!unique.contains(i))unique.add(i);
            else return true;
        }
        return false;
    }
}