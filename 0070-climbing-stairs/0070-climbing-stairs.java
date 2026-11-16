class Solution {
    int dp[]=new int[46];
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        return func(n);
    }
    int func(int n){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=func(n-1)+func(n-2);

    }
}