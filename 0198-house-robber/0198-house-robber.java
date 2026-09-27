class Solution {
    int dp[]=new int[101];
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        return func(nums,0);
    }
    int func(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int a=nums[i]+func(nums,i+2);
        int b=func(nums,i+1);
      return dp[i]=Math.max(a,b);
    }
}