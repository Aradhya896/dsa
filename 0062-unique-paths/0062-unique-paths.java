class Solution {
    int dp[][]=new int[101][101]; 
    public int uniquePaths(int m, int n) {
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(m-1,n-1,m,n);
    }
    int func(int r,int d,int m,int n){
     if(r==0 && d==0){
        return 1;
     }
     if(r<0 || d<0){
        return 0;
     }
     if(dp[r][d]!=-1){
        return dp[r][d];
     }
    int up=func(r,d-1,m,n);
    int left=func(r-1,d,m,n);
    return dp[r][d]=up+left;
    }
}