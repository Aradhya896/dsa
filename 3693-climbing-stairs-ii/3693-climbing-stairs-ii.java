class Solution {
    int dp[]=new int[100001];
    public int climbStairs(int n, int[] costs) {
        Arrays.fill(dp,-1);
        return func(n,0,costs);
    }
    int func(int n,int i, int costs[]){
        if(i==n){
            return 0;
        }
        int ans= Integer.MAX_VALUE;
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=1;j<=3;j++){
            int k=i+j;

             if (k <= n) {

                int cost = costs[k - 1] + j * j;

                int total = cost + func(n, k, costs);

                ans = Math.min(ans, total);
        }}
       return dp[i]=ans;
    }
}