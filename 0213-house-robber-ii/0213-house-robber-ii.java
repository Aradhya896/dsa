class Solution {
    int dp[]=new int[101];
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        
     // int i=0;
        
        int res1=0;
        int res2=0;
        Arrays.fill(dp,-1);
  dp[0]=0;
     for(int i=1;i<=nums.length-1;i++){
    int a=nums[i-1]+(i-2>=0?dp[i-2]:0);
          int b=dp[i-1];
          dp[i]=Math.max(a,b);
        
         }  res1=dp[n-1];

          Arrays.fill(dp,-1);
          dp[0]=0;
  dp[1]=nums[1];
        for(int i=2;i<=nums.length-1;i++){
      int a=nums[i]+(i-2>=0?dp[i-2]:0);
          int b=dp[i-1];
       dp[i]=Math.max(a,b);
         
        }res2=dp[n-1];
         
         return Math.max(res1,res2);
    }}
