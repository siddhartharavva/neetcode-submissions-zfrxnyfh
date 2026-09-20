class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int hmax = 0;
        while(l<r){
            hmax = Math.max(hmax,(r-l)*Math.min(heights[l],heights[r]));
            if(heights[l]>heights[r])r--;
            else l++;                    
        }
        return hmax;













        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int l = 0, r = heights.length-1;
        int maxArea = 0;
        while(l<r){
            int area = Math.min(heights[l],heights[r])*(r-l);
            maxArea = Math.max(maxArea,area);
            if(heights[l]<heights[r])l++;
            else r--;
        }
        return maxArea;*/
    }
}
