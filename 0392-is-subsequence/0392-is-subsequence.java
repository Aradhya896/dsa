class Solution {
    public boolean isSubsequence(String s, String t) {
        return func(s,t,0,0);
    }
    boolean func(String s,String t,int i,int j){
        if(i==s.length()){
            return true;
        }
         if(j>=t.length()){
    return false;
         }
      
        if(s.charAt(i)==t.charAt(j)){
           return func(s,t,i+1,j+1);
        }else{
        return func(s,t,i,j+1);
         } 
    }
}