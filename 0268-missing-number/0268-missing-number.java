class Solution {
    public int missingNumber(int[] nums) {
  int n=nums.length;
       int Asum=0;
       int idealSum=(n*(n+1))/2;
       for( int i=0; i<nums.length;i++){
      Asum+=nums[i];
       }
       return idealSum-Asum;
    }
}