class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();        
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) if (grid[r][c] == 0) q.offer(new int[]{r, c});                            
        }
        int[][] dir = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr < 0 || nc < 0 || nr >= grid.length || nc >= grid[0].length)continue;
                if (grid[nr][nc] != Integer.MAX_VALUE)continue;
                grid[nr][nc] = grid[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }
    }
}