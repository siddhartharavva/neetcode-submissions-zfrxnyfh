class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int [] ans = new int [2];
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum-target>0)r--;
            if(sum-target<0)l++;
            if(sum==target){
                ans[0] = l+1;
                ans[1] = r+1;
                return ans;
            } 
        }
        return new int[]{-1,-1};
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        /*int l = 0, r = numbers.length-1;        
        while(l<r){
            int sum = numbers[l]+ numbers[r];
            if(sum==target)return new int[]{l+1,r+1};
            else if (sum<target)l++;
            else r--;
        }
        return new int[]{-1,-1};
        */
    }
        
}
