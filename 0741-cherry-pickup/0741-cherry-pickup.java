class Solution {
    int dp[][][]=new int[51][51][51];
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
           Arrays.fill(dp[i][j],-20000); 
        }  
        }
        return Math.max(0,func(n-1,n-1,n-1,grid));
    }
    int func(int r1, int c1,int r2,int arr[][]){
        int n=arr.length;
        int c2=r1+c1-r2;
        if(r1<0 || c1<0 ||r2<0||c2<0){
            return -200000;
        }
        if(arr[r1][c1]==-1 || arr[r2][c2]==-1){
            return -200000;
        }
        if(r1==0 && c1==0){
            return arr[0][0];
        }
        if(dp[r1][c1][r2]!=-20000){
            return dp[r1][c1][r2];
        }
        int c=arr[r1][c1];
        if(r1!=r2 || c1!=c2){
            c+=arr[r2][c2];
        }
        int uu=func(r1-1,c1,r2-1,arr);
        int ul=func(r1-1,c1,r2,arr);
        int lu=func(r1,c1-1,r2-1,arr);
        int ll=func(r1,c1-1,r2,arr);
        
         int max=Math.max(Math.max(uu,ul),Math.max(lu,ll));  
        
       return dp[r1][c1][r2]=c+max;
    }
}