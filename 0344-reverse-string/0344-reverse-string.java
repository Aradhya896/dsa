class Solution {
    public void reverseString(char[] s) {
        func(s,0,s.length-1);
    }
    void func(char[] s , int i,int j){
        if(i>=j){
            return;
        }
       char temp=s[i];
       s[i]=s[j];
       s[j]=temp;
       func(s,i+1,j-1);
    }
}