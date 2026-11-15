class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[52];
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
            arr[ch-'a']++;
        }else{
            arr[ch-'A'+26]++;
        }}
        boolean odd=false;
        for(int i=0;i<52;i++){
            if(arr[i]%2==0){
             c+=arr[i];
            }else{
                c+=arr[i]-1;
                odd=true;
            }
           
        }
        if(odd){
            c++;
        }
         return c;
    }
}