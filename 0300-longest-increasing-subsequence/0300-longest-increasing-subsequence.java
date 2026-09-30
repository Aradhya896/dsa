class Solution {
    int dp[][]=new int[2501][2501];
    public int lengthOfLIS(int[] nums) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return func(nums,0,-1);
    }
    int func(int nums[],int i,int p){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i][p+1]!=-1){
            return dp[i][p+1];
        }
        int take=0;
        if(p==-1 || nums[p]<nums[i]){
            take=1+func(nums,i+1,i);
           
        }
        int skip=func(nums,i+1,p);
     return dp[i][p+1]= Math.max(take,skip);
    }
}