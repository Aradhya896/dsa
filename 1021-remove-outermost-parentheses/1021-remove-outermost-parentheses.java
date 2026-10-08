class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                c--;
            }
            if(c!=0){
                ans=ans+s.charAt(i);
            } if(s.charAt(i)=='('){
                c++;
            }
        }return ans;

    }
}