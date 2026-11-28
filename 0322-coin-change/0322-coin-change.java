class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
       int dp[][]=new int[n][amount+1];
       for(int i[]:dp){
        Arrays.fill(i,-1);
        }
        int ans=func(n-1,amount,coins,dp);
         if(ans==(int)1e9){
            return -1;
         }else{
            return ans;
         }
    }
    int func(int i, int target,int coins[],int dp[][]){
        if(target==0){
            return 0;
        }
        if(target<0 || i<0){
            return (int)1e9;

        }if(dp[i][target]!=-1){
            return dp[i][target];
        }
       
        int take=1+func(i,target-coins[i],coins,dp);
        int notTake=func(i-1,target,coins,dp);
        
       
        return  dp[i][target]=Math.min(take,notTake);
    }
}