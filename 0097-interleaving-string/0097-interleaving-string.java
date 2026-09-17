class Solution {
Boolean dp[][]=new Boolean[101][101];
    public boolean isInterleave(String s1, String s2, String s3) {
       //for(boolean i[]:dp){
      // Arrays.fill(i,false);
      if (s1.length() + s2.length() != s3.length()) { 
        return false;
         }
          return func(0,0,0,s1,s2,s3);
    }
    boolean func(int i,int j,int k, String s1,String s2,String s3){
     if( k==s3.length()){
        return (i==s1.length() && j==s2.length());
     }
     if(dp[i][j]!=null){
        return dp[i][j];
     }
     boolean c1=false;
     boolean c2=false;
     if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
           c1=func(i+1,j,k+1,s1,s2,s3);
           dp[i][j]=c1;
     }if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
           c2=func(i,j+1,k+1,s1,s2,s3);
           dp[i][j]=c2;
     }
     dp[i][j]=c1|| c2;
     return dp[i][j];
    }
}