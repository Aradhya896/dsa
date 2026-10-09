class Solution {
    int dp[][]=new int[201][201];
    public int minFallingPathSum(int[][] matrix) {

        int m=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i[]:dp){
            Arrays.fill(i,-1000);
        }
for (int j = 0; j < matrix[0].length; j++) {
            ans = Math.min(ans, func(matrix, 0, j));
        }

        return ans;
    }
    int func(int matrix[][],int i,int j){
int m=matrix.length;
int n=matrix[0].length;
if(j<0 || j>=n){
    return Integer.MAX_VALUE;
}  if(i==m-1 ){
return matrix[i][j];

}   
if(dp[i][j]!=-1000){
    return dp[i][j];

}
int a=func(matrix,i+1,j-1);
int b=func(matrix,i+1,j);
   int c=func(matrix,i+1,j+1);
   int min=Math.min(a,Math.min(b,c));

   return dp[i][j]=matrix[i][j]+min;
    }

}