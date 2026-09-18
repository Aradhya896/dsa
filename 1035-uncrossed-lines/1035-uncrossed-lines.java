class Solution {
    int dp[][]=new int[501][501];
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
      
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
       return func(0,0,nums1,nums2);
    }
    int func(int i,int j,int[] nums1,int[] nums2){
        if(i>=nums1.length || j>=nums2.length){
            return 0;
        }if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=0;
        int c2=0;
        int c3=0;
        if(nums1[i]==nums2[j]){
            c1=1+func(i+1,j+1,nums1,nums2);
            dp[i][j]=c1;
        }else{
           c2=func(i+1,j,nums1,nums2);
            c3=func(i,j+1,nums1,nums2);
            dp[i][j]=Math.max(c2,c3);
        }
        return dp[i][j];
    }
}
    