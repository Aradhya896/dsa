class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(isVowel(arr[i]) && isVowel(arr[j])){
                char c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
                i++;
                j--;

            }else if(!isVowel(s.charAt(i))){
              i++;
            }else{
                j--;
            }
        } return new String(arr);
         }
boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' ||
           ch == 'O' || ch == 'U';
}
   
}