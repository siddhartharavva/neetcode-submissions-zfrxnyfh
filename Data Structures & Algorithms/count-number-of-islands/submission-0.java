class Solution {
    public int numIslands(char[][] grid) {  
        int count = 0;      
        for(int r = 0; r < grid.length;r++){
            for(int c = 0 ; c < grid[0].length;c++)count+=dfs(r,c,grid,0);                     
        }
        return count;
    }

    boolean isValidr(int r,char [][] grid){
        return r>=0 && r < grid.length;
    }
    boolean isValidc(int c,char [][] grid){
        return c>=0 && c < grid[0].length;
    }
    int dfs(int r,int c,char [] []grid,int count){
        if(!isValidr(r,grid) || !isValidc(c,grid))return count;    
        if (grid[r][c] == '0')return 0;                  
        grid[r][c]='0';
        dfs(r+1,c,grid,count);
        dfs(r-1,c,grid,count);
        dfs(r,c+1,grid,count);
        dfs(r,c-1,grid,count);
        return 1;
    }
}
