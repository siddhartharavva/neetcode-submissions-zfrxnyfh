class Solution {
    public int orangesRotting(int[][] grid) {
        Queue <int[]> q = new LinkedList<>();
        int count = 0;
        int fr = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c]==2)q.offer(new int []{r,c});
                else if (grid[r][c]==1)fr++;
            }
        }
        if(fr==0)return 0;
        int [][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fr>0){
            int s = q.size();
            for(int i = 0 ; i < s;i++){
                int[] rc =  q.poll();            
                int r = rc[0];
                int c = rc[1];
                for(int [] d : dir){
                    int nr = r+d[0];
                    int nc = c+d[1];
                    if(nr<0 || nc < 0 || nr>=grid.length || nc>=grid[0].length)continue;
                    if(grid[nr][nc]!=1)continue;
                    grid[nr][nc]=2; 
                    fr--;               
                    q.offer(new int[]{nr,nc});
                }
            }
            count++;
        }
        return  fr==0 ? count : -1;
    }
}
