class Solution {
    public int minimumBeautifulSubstrings(String s) {
       
           // check(s);
            int ans= solve(s,0, 0);
             if(ans==9999){
                return -1;
             } return ans;
    }
    int solve(String s,int i,int prev){
    if(i>=s.length()){

            if (prev < s.length() && check(s.substring(prev, i))) {
                return 1;
            }
        return 9999;
    }
    String temp = s.substring(prev, i + 1);
    int a=9999;
    int b=9999;
    int ans=0;
    //if(s.charAt(i)=='0'){
    //    return 9999;
  //  }
    if(check(temp)){
     a=1+solve(s,i+1,i+1);
     //b=solve(s,i+1,prev);
    }
        b=solve(s,i+1,prev);
    
    return Math.min(a,b);
   
    }
    boolean check(String s){
        if(s.charAt(0)=='0'){
            return false;
        }
        int b=Integer.parseInt(s,2);
     for(int i=0;i<10;i++){
        int p=(int)Math.pow(5,i);
        if(p==b){
            return true;
        }
      
     }
            return false;  
    }
}