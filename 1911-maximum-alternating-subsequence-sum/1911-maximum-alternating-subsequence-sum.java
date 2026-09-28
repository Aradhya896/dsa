class Solution {
    long dp[][]=new long[100001][2];
    public long maxAlternatingSum(int[] nums) {
        for(long i[]:dp){
            Arrays.fill(i,-1);
        }
       return func(0,nums,true);
    }
    long func( int i,int nums[], boolean flag){
        
        if(i>=nums.length){
            return 0;
        }
        if(dp[i][flag ? 1 : 0]!=-1){
            return dp[i][flag ? 1 : 0];
        }
       
long skip=func(i+1,nums,flag);

int val=nums[i];
if(flag!=true){
    val=-1*val;
}
long take=func(i+1,nums,!flag)+val;
    
    return dp[i][flag ? 1 : 0]=Math.max(skip,take);
   
}}