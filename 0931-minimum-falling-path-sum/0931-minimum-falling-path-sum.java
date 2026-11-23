class Solution {
   
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
         int dp[][]=new int[m][n];
         for(int row[]:dp){
            Arrays.fill(row,-102);
         }
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
      ans=Math.min(ans, func(m-1,i,matrix,dp)) ;
    }
    return ans;
    }
    int func(int r,int c,int arr[][],int dp[][]){
        if(c<0|| c>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(r==0){
            return arr[0][c];
        }
        if(dp[r][c]!=-102){
            return dp[r][c];
        }
        //int min=Integer.MAX_VALUE;
        int leftDiag=func(r-1,c-1,arr,dp);
        int up=func(r-1,c,arr,dp);
        int rightDiag=func(r-1,c+1,arr,dp);

   int min = Math.min(up, Math.min(leftDiag, rightDiag));

//if(min == Integer.MAX_VALUE) {
   // return Integer.MAX_VALUE;
//}

return dp[r][c]=arr[r][c] + min;
    }
}