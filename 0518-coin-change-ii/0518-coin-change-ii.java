
    class Solution {
    int dp[][]= new int[302][5010];
    int func(int coins[],int amount,int idx,int sum){
        
       

        if(sum==amount){
            return 1;
        }if(sum>amount || idx>=coins.length){
            return 0;
        }
        if(dp[idx][sum]!=-1){
            return dp[idx][sum];
        }int c1=func(coins,amount,idx,sum+coins[idx]);
        int c2=func(coins,amount,idx+1,sum);
       return dp[idx][sum]=c1+c2;
    }
    
    public int change(int amount, int[] coins) {
       // int dp[][]=new int[302][5010];
        for(int i[]:dp){
            
            Arrays.fill(i,-1);
        }

        return func(coins,amount,0,0);
    }
    
}