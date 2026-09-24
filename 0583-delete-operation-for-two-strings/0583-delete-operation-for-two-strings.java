class Solution {
     int dp[][]=new int[1001][1001];
    public int minDistance(String word1, String word2) {
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
       return func(0,0,word1,word2);
    }
    int func(int i,int j,String text1,String text2){
        if(i>=text1.length()){
            return text2.length()-j;
        } if( j>=text2.length()){
            return text1.length()-i;
        }if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int c1=0;
        int c2=0;
        int c3=0;
        if(text1.charAt(i)==text2.charAt(j)){
            c1=func(i+1,j+1,text1,text2);
            dp[i][j]=c1;
        }
        
    else{
    c1=func(i+1,j,text1,text2); 
    c2=func(i,j+1,text1,text2);

    dp[i][j]=1+Math.min(c1,c2);

        }
        return dp[i][j];
   
    } 
    } 