class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        ArrayList <List<Integer>> ans = new ArrayList<>();
        for(int r = 0 ; r < heights.length;r++){
            for(int c = 0 ; c < heights[0].length;c++){
                boolean[][] vis1 = new boolean[heights.length][heights[0].length];
                boolean[][] vis2 = new boolean[heights.length][heights[0].length];
                if (dfs(r, c, true, heights, vis1) && dfs(r, c, false, heights, vis2))ans.add(Arrays.asList(r, c));
            }
        }
        return ans;
    }

    boolean dfs(int r,int c,boolean l,int [][] h,boolean[][] vis){
        if(r<0 || c < 0 || r>=h.length || c>=h[0].length)return false;
        if(vis[r][c])return false;
        vis[r][c] = true;
        if(l){ 
            if(r==0 || c ==0)return true;
        }else {
            if(r==h.length-1 || c == h[0].length-1)return true;
        }
        int[][] dir = {{-1, 0},{1, 0},{0, -1},{0, 1}};
        for (int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];
            if (nr < 0 || nc < 0 || nr >= h.length || nc >= h[0].length)continue;
            if (h[nr][nc] <= h[r][c]) {
                if (dfs(nr, nc, l, h, vis))return true;
            }
        }
        return false;
    }
}
