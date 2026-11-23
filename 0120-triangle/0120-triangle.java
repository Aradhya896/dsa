class Solution {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n=triangle.size();
        //int m=triangle.getsize();
        int dp[][]=new int[n][n];
        int ans=Integer.MAX_VALUE;
        for(int row[]:dp){
            Arrays.fill(row,-10004);

        }
        for(int i=0;i<n;i++){
         ans=Math.min(ans,func(triangle,n-1,i,dp));
        
        }
        return ans;
    } int func(List<List<Integer>> triangle,int i,int j,int dp[][]){
        if( j<0 || j >= triangle.get(i).size()){
            return Integer.MAX_VALUE;

        }
        if(i==0){
            return triangle.get(0).get(0);
        }
        if(dp[i][j]!=-10004){
            return dp[i][j];
        }
        int d=func(triangle,i-1,j,dp);
        int dr=func(triangle,i-1,j-1,dp);
      
      return dp[i][j]=triangle.get(i).get(j)+Math.min(d,dr);
    
    }
}