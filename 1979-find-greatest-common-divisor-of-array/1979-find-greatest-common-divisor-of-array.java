class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int res=1;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);

        }
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                res=i;
            }
        }
       return res;
    }
}