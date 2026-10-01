class Solution {
    Boolean dp[][][]=new Boolean[101][101][201];
    public boolean hasValidPath(char[][] grid) {
        return func(grid,0,0,0);
    }
    boolean func(char[][]grid,int i,int j,int a){
        int n=grid.length;
if(i>=grid.length){
    return false;
}if(j>=grid[0].length){
    return false;
}


if(grid[i][j]=='('){
    a++;
}else{
    a--;
 } 
  if (a < 0) {
            return false;
        }

    
 if (i == grid.length - 1 && j == grid[0].length - 1) {
            return a == 0;
        }
        if (dp[i][j][a] != null) {
    return dp[i][j][a];
}
boolean c1=func(grid,i+1,j,a);
    boolean c2=func(grid,i,j+1,a);

  dp[i][j][a] = c1 || c2;

        return dp[i][j][a];


    }
}