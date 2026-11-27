class Solution {
   
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int s=0;
         for(int num:stones){
            s+=num;
        }
         int target=s/2;
         int dp[][]=new int[n][target+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
       
       
        for(int i=target;i>=0;i--){
             if(func(n-1, i, stones,dp)) {
                return s- 2*i;
            }
        }
        return 0;
    }
    boolean func(int i,int target,int arr[],int dp[][]){
        
        if(target==0){
            return true;
        }
        if(i<0){
            return false;
        }
        if(dp[i][target]!=-1){
            return dp[i][target]==1;
        }
         boolean take=false;
         if(arr[i]<=target){
        take=func(i-1,target-arr[i],arr,dp);
    } boolean notTake=func(i-1,target,arr,dp);
      boolean ans=take||notTake;
 dp[i][target]=ans?1:0;
      return ans;
}}