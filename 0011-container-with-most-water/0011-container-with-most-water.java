class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        int prod=1;
       while(l<=r){
        prod=(r-l)*(Math.min(height[l],height[r]));
        max=Math.max(prod,max);
       
       if(height[l]<=height[r]){
        l++;
       }else{
        r--;
       }}
        return max;
    }
}