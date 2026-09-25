class Solution {
    int dp[][]=new int[1001][1001];
    public int findLongestChain(int[][] nums) {
      
Arrays.sort(nums, (a, b) -> a[0] - b[0]);
    
        for(int i[]:dp){
        Arrays.fill(i,-99);
           }   return  func(nums,0,-1);
    }
    public int func(int nums[][], int idx, int prevIdx){

        if(idx==nums.length){
            return 0;
        }
        if(dp[idx][prevIdx+1]!=-99){
           return  dp[idx][prevIdx+1];
        }
        
        int skip=func(nums,idx+1,prevIdx);
        int take=0;
        if(prevIdx==-1 || nums[idx][0]>nums[prevIdx][1]){
            take=1+func(nums,idx+1,idx);

        }
        
       
        dp[idx][prevIdx+1]=Math.max(skip,take);
        return dp[idx][prevIdx+1];
    }
}