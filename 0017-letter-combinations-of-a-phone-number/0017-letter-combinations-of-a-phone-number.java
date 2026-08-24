class Solution {
    String map[];
    public Solution(){
        map=new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }
    public List<String> letterCombinations(String digits) {
       List<String>al=new ArrayList<>();
       if(digits.length()==0){
        return al;
       }
       func(digits,al,0,"");
       return al; 
    }
    public void func(String digits, List<String>al,int idx,String curr) {
        if(idx==digits.length()){
            al.add(curr);
            return;
        }
        String s=map[digits.charAt(idx)-'0'];
        for(int i=0;i<s.length();i++){
            func(digits,al,idx+1,curr+s.charAt(i));
        }

    }
}