class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)==st.peek()){
               st.pop();
         str.deleteCharAt(str.length() - 1);

           //st=st.replace(String.valueOf(st.charAt(i+1),"");
           }else{
            st.push(s.charAt(i));
            str.append(s.charAt(i));
           }
        }
          return str.toString();
    }
}