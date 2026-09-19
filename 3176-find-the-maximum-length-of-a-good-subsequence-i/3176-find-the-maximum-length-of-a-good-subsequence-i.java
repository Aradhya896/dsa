class Solution {
   
    public int maximumLength(int[] nums, int k) {
 int dp[][][]=new int[nums.length][nums.length][27];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return func(0,-1,nums,k,dp);
    }
    int func(int i,int prev,int nums[],int k,int[][][]dp){
        
        if(i==nums.length){
            return 0;
        }int m=0;
        if(dp[i][prev+1][k]!=-1){
            return dp[i][prev+1][k];
        }
        int a=0;
        
    
        if(prev==-1){
a=1+func(i+1,i,nums,k,dp);
       }
    
      else if(nums[prev]==nums[i] ){
        a=1+func(i+1,i,nums,k,dp);
      } else if( k>0){
        a=1+func(i+1,i,nums,k-1,dp);
     }
        int b=func(i+1,prev,nums,k,dp);

       
    
 dp[i][prev+1][k] =Math.max(a,b);
 return dp[i][prev+1][k];
    }
}