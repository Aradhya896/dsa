class Solution {
    int dp[][]=new int[301][301];
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int total=0;
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
        total += func(i, j, matrix);
    }
}

return total;
    }
    int func(int r, int c,int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
if(r<0 || c<0 || r>m-1 || c>n-1){
    return 0;
}
if(arr[r][c]==0){
    return 0;
}
if(dp[r][c]!=-1){
    return dp[r][c];
}
int x=func(r+1,c,arr);
int y=func(r,c+1,arr);
int z=func(r+1,c+1,arr);

return dp[r][c]=1+Math.min(x,Math.min(y,z));
}
    
}