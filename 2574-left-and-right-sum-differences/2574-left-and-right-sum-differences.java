class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
}
int rs=0;
int ls=0;
 
for(int i=0;i<nums.length;i++){
    

    rs=totalSum-nums[i]-ls;
    
   
 arr[i]=Math.abs(rs-ls);
 
 ls+=nums[i];
}
return arr;
    }
}