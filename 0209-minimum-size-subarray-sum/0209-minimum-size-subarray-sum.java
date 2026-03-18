class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        int r=0;
        for( r=0;r<n;r++){
         sum+=nums[r];
        
        
        while(sum>=target){
            min=Math.min(min,r-l+1);
            sum=sum-nums[l];
            l++;
        }}
        return min==Integer.MAX_VALUE?0:min;
    }}