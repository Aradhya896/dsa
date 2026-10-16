class Solution {
    int dp[]=new int[101];
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
      int i=0;
        dp[0]=0;
        dp[1]=nums[i];
        //int c=0;
        for(i=2;i<=nums.length;i++){
     
        
        int a=nums[i-1]+dp[i-2];
          int b=dp[i-1];
        dp[i]=Math.max(a,b);
        }
        return dp[nums.length];
    }}
