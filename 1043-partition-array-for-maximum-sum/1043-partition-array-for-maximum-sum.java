class Solution {
    int dp[][]=new int[501][501];
    public int maxSumAfterPartitioning(int[] arr, int k) {
        for(int i[]:dp){
        Arrays.fill(i,-1);
        }
       return  func(0,0,arr[0],arr,k);
    }
    int func(int i,int prev,int max,int arr[],int k){
        if(i>=arr.length){
            return 0;
        }
        int l=i-prev+1;

        max=Math.max(max,arr[i]);
        int partition=0;
        int notPartition=0;
       // int ans=0;
       if(dp[i][prev]!=-1){
        return dp[i][prev];
       }
        if(l==k){
            
        
        partition=(l*max)+func(i+1,i+1,0,arr,k);
        // ans=Math.max(ans,partition);
        }else{
            partition=(l*max)+func(i+1,i+1,0,arr,k);
        notPartition=func(i+1,prev,max,arr,k);
        
       // ans=Math.max(ans,partition);
       // ans=Math.max(ans,notPartition);
        }
        dp[i][prev]=Math.max(partition,notPartition);
        return dp[i][prev];
    }
}