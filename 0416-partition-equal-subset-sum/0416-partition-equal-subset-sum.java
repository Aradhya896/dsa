class Solution {
    
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i:nums){
            s+=i;
        }
        int target=s/2;
    int  dp[][]=new int [n][target+1];

      for(int row[]:dp){
        Arrays.fill(row,-1);
      }
      if(s % 2 != 0) return false;
        
        return func(nums.length-1,target,nums,dp);
    }
    boolean func(int i,int target,int arr[],int dp[][]){
        if(target==0){
            return true;
        }
        if(i<0){
            return target==0;
        }
       
        if(dp[i][target]!=-1){
            return dp[i][target]==1;
        }
         boolean take1=false;
          boolean take2=false;
      if(arr[i]<=target){
     take1=func(i-1,target-arr[i],arr,dp);
      }
      take2=func(i-1,target,arr,dp);
    
   boolean ans=take1 || take2;
    dp[i][target] = ans?1:0;

        return ans;
    }
}