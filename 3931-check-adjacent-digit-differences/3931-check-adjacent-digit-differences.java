class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
      int n=s.length();
        boolean ans=true;
        for(int i=0;i<n-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))>2){
                ans=false;
            }
            }
        return ans;
        }
        
    }
