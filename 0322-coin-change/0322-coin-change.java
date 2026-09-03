class Solution {
    int dp[][]= new int[13][10004];
    int func(int coins[],int amount,int idx){
        
       

        if(amount==0){
            return 0;
        }if(amount<0 || idx>=coins.length){
            return (int)1e9;
        }
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }int c1=1+func(coins,amount-coins[idx],idx);
        int c2=func(coins,amount,idx+1);
       return dp[idx][amount]=Math.min(c1,c2);
    }
    public int coinChange(int[] coins, int amount) {
       // int dp[][]=new int[13][5010];
        for(int i[]:dp){
            
            Arrays.fill(i,-1);
        }

      
        int ans=func(coins,amount,0);
        if(ans==(int)1e9){
            return -1;
        }else{
          return ans;
        }
    }
}