class Solution {
    int dp[][]=new int[1001][1001];
   public int numDistinct(String s, String t) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
       return func(0,0,s,t);
    }
    int func(int i,int j,String s,String t){
        if(j>=t.length()){
            return 1;
        }
        if(i>=s.length()) {
            return 0;
        } 
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=0;
        int c2=0;
       // int c3=0;
        if(s.charAt(i)==t.charAt(j)){
            c1=func(i+1,j+1,s,t) +func(i+1,j,s,t);;
            dp[i][j]=c1;
        }else{
           c2=func(i+1,j,s,t);
           // c3=func(i,j,s,t);
            dp[i][j]=c2;
        }
        return dp[i][j];
    }
}
    
        
    