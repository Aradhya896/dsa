class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int ans=-1;
     int totalSum=0;
    for(int i=0;i<nums.length;i++){
           totalSum+=nums[i];
 }   int rightSum=0;
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
           
                rightSum=totalSum-nums[i]-leftSum;
              
                if(rightSum==leftSum){
                     return i;
                }
                  leftSum+=nums[i];
            
        } 
        return -1;

    }
}