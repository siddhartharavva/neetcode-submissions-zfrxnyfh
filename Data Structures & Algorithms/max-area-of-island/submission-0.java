class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max  = 0;
        int count  = 0;
        for(int r = 0 ; r < grid.length;r++){
            for(int c = 0 ; c < grid[0].length;c++)max = Math.max(dfs(r,c,grid),max);     
        }
        return max;
    }
    boolean isValidR(int r , int [][] grid){
        return r >= 0 && r<grid.length;
    }
    boolean isValidC(int c , int [][] grid){
        return c >= 0 && c<grid[0].length;
    }
    int dfs(int r,int c,int [][] grid){
            if(!isValidR(r,grid) || !isValidC(c,grid))return 0;
            if(grid[r][c]==0)return 0;            
            grid[r][c]=0;
            return  1 + dfs(r,c+1,grid) + dfs(r,c-1,grid) + dfs(r+1,c,grid) + dfs(r-1,c,grid);
    }
}   
