class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        int rem=0;
        StringBuilder s=new StringBuilder();
        while(n>0){
        n=n-1;
        rem=n%26;
        char ch=(char)('A'+rem);
        s.append(ch);
        n=n/26;
        }
        return s.reverse().toString();
    }
}