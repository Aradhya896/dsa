class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
           int sum= func(nums[i]);
            if(sum==i){
                min=Math.min(min,i);
            }
            
        }
        if(min>100){
            min= -1;
        }
        return min;
    }
    int func(int num){
        int n=num;
        int sum=0;
        while(n>0){
            sum+=n%10;
           n= n/10;
        }
        return sum;
    }
}