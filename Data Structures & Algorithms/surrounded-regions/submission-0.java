class Solution {
    public void solve(char[][] board) {
        boolean vis [][] = new boolean[board.length][board[0].length];
        for(int r = 0 ;  r < board.length;r++){
            for(int c = 0 ;  c < board[0].length;c++){
                if(r == 0 || r == board.length -1 || c ==0 || c == board[0].length-1)dfs(r,c,board,vis);
            }
        }

        for(int i = 0 ; i < vis.length;i++){
            for(int j = 0 ; j < vis[0].length;j++){
                if(!vis[i][j] && board[i][j]!='X')board[i][j]='X';
            }
        }        
    }
    void dfs(int r , int c , char[][]board,boolean [][]vis){
        if(r<0 || c <0 || r >= board.length || c >=board[0].length)return;
        if (vis[r][c]|| board[r][c] == 'X') return;
        if(board[r][c]=='O')vis[r][c]=true;
        
        dfs(r+1,c,board,vis);
        dfs(r-1,c,board,vis);
        dfs(r,c+1,board,vis);
        dfs(r,c-1,board,vis);
    }
}
