class Solution {
    public boolean isPalindrome(String str){
      
    String s = new StringBuilder(str).reverse().toString();
    return s.equals(str);
}
    
    public void func(String s, List<String>al,List<List<String>>ans ){
       if(s.length()==0){
        ans.add(new ArrayList<>(al));
        return;
       }
       for(int i=0;i<s.length();i++){
        String part=s.substring(0,i+1);
        if(isPalindrome(part)){
            al.add(part);
            func(s.substring(i+1),al,ans);
            al.remove(al.size()-1);
        }
       }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>al=new ArrayList<>();
         func(s,al,ans);
         return ans;
    }
}