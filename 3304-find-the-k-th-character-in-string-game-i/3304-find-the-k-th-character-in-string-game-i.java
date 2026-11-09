class Solution {
    public char kthCharacter(int k) {
    StringBuilder s=new StringBuilder("a");
   return  func(k,s);
    }
    char func(int k,StringBuilder s){
        
     if(s.length()>=k){
        return s.charAt(k-1);
     }
     int n=s.length();
     for(int i=0;i<n;i++){
    s.append((char)(s.charAt(i)+1));
     }
     return func(k,s);
    
    }
}