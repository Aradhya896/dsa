
class Solution {
    int dp[][]=new int[201][201];
    public int minPathSum(int[][] grid) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return func(grid, 0, 0);
    }

    int func(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        if (i == m - 1 && j == n - 1) {
            return grid[i][j];
        }
if(dp[i][j]!=-1){
return dp[i][j];

}
        int r = func(grid, i, j + 1);
int d = func(grid, i + 1, j);
        int ans = Math.min(r, d);

return dp[i][j]=grid[i][j] + ans;
    }
}