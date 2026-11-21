class Solution {
    public boolean isSubsequence(String s, String t) {
        return func(s,t,s.length()-1,t.length()-1);
    }
    boolean func(String s,String t,int i,int j){
        if(i<0){
            return true;
        }
         if(j<0){
    return false;
         }
      
        if(s.charAt(i)==t.charAt(j)){
           return func(s,t,i-1,j-1);
        }else{
        return func(s,t,i,j-1);
         } 
    }
}