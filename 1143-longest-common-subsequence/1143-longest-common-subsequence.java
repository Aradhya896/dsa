class Solution {
    int dp[][]=new int[1001][1001];
    public int longestCommonSubsequence(String text1, String text2) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
       return func(0,0,text1,text2);
    }
    int func(int i,int j,String text1,String text2){
        if(i>=text1.length() || j>=text2.length()){
            return 0;
        }if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=0;
        int c2=0;
        int c3=0;
        if(text1.charAt(i)==text2.charAt(j)){
            c1=1+func(i+1,j+1,text1,text2);
            dp[i][j]=c1;
        }else{
           c2=func(i+1,j,text1,text2);
            c3=func(i,j+1,text1,text2);
            dp[i][j]=Math.max(c2,c3);
        }
        return dp[i][j];
    }
}