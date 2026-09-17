class Solution {
int dp[][]=new int[1001][1001];
    public int longestPalindromeSubseq(String s) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return func(0,s.length()-1,s);

    }
    int func(int i, int j,String s){
        if(i==j){
            return 1;
        }
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
       // int c1=0;
        int c2=0;
        int c3=0;
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= 2+ func(i+1,j-1,s);
            return dp[i][j];
        }else{
            c2=func(i+1,j,s);
            c3=func(i,j-1,s);
            
        
        }
        dp[i][j]= Math.max(c2,c3);
        return dp[i][j];
    }

    }
