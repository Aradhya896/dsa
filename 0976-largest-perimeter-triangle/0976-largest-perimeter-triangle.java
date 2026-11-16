class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=nums.length-1;i>=2;i--){
            int a=nums[i];
            int b=nums[i-1];
            int c=nums[i-2];
            if(b+c>a){
                ans=Math.max(ans,a+b+c);
            }
        }
        return ans;
    }
}