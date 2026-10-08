class Solution {
    int dp[]=new int[1001];
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp,-1);
        return Math.min(func(cost,0), func(cost,1));
    }
    int func(int cost[],int i){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
return dp[i];
        }
int take1=0;
        int take2=0;
take1=cost[i]+func(cost,i+1);

        take2=cost[i]+func(cost,i+2);
return dp[i]=Math.min(take1,take2);

    }
}