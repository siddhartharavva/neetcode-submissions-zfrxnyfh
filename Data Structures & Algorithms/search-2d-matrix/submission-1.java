class Solution {

    boolean rs(int [][]matrix,int target,int l,int r){
        if (l > r) return false;
        int mid = l + (r-l)/2;
        if(target<matrix[mid][0]){
            return rs(matrix,target,l,mid-1);
        }else if (target > matrix[mid][matrix[mid].length - 1]) {
            return rs(matrix, target, mid + 1, r);
        }else {
            return bs(mid, matrix, target, 0, matrix[mid].length - 1);
        }
    }
    boolean bs(int row, int[][]matrix,int target,int l , int r){
        if(l>r)return false;
        int mid = l + (r-l)/2;
        if(target==matrix[row][mid]){
            return true;
        }else if(target>matrix[row][mid]){
            return bs(row,matrix,target,mid+1,r);
        }else{
            return bs(row,matrix,target,l,mid-1);
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        return rs(matrix,target,0,matrix.length-1);
    }   
}
