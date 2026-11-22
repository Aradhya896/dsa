class Solution {
    int dp[][]=new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid);
    }
    int func(int r,int d,int arr[][]){
        if(r==0 && d==0 && arr[r][d]==0){
            return 1;
        }
        if(r<0 || d<0){
            return 0;
        }
        if(dp[r][d]!=-1){
            return dp[r][d];
        }
        int up=0;
        int left=0;
        if(arr[r][d]==0){
            up=func(r,d-1,arr);
            left=func(r-1,d,arr);
        }
        return dp[r][d]=up+left;
    }
}