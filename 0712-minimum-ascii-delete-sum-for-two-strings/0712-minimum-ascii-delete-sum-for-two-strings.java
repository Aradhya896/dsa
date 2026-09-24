class Solution {
    int dp[][]=new int[1001][1001];
  public int minimumDeleteSum(String s1, String s2) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
       return func(0,0,s1,s2);
    }
    int func(int i,int j,String s1,String s2){
        if (i >= s1.length()) {
            int sum = 0;
            for (int k = j; k < s2.length(); k++) {
                sum += s2.charAt(k);
            }
            return sum;
        }

         if (j >= s2.length()) {
            int sum = 0;
            for (int k = i; k < s1.length(); k++) {
                sum += s1.charAt(k);
            }
            return sum;
        }
if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=0;
        
        if(s1.charAt(i)==s2.charAt(j)){
            c1=func(i+1,j+1,s1,s2);
            dp[i][j]=c1;
        }else{
          int c2=s1.charAt(i)+func(i+1,j,s1,s2);
           int c3=s2.charAt(j)+func(i,j+1,s1,s2);
            dp[i][j]=Math.min(c2,c3);
        }
        return dp[i][j];
    }
}
   
        
    