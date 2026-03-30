class Solution {
    public int trap(int[] height) {
        int r = height.length-1;
        int l = 0;
        int lm = height[l];
        int rm = height[r];
        int water = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(lm<height[l])lm = height[l++];
                else water += lm-height[l++];                
                
            }else{
                if(rm<height[r])rm = height[r--];
                else water += rm-height[r--];
                            
            }
        }
        return water;


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int r = height.length-1;
        int l = 0; 
        int rm = 0;
        int lm = 0;
        int res = 0;
        while(l<r){
                if(height[l]<=height[r]){
                    if(height[l]>=lm)lm = height[l];
                    else res+=lm-height[l];
                    l++;
                }else{
                    if(height[r]>=rm)rm = height[r];
                    else res+=rm-height[r];
                    r--;

                }
        }
        return res;*/
    }
}