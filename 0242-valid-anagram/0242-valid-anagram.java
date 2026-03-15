class Solution {
    public boolean isAnagram(String s, String t) {
       /* //HashMap <Character,Integer> map= new HashMap<>();
        int freq[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
          freq[s.charAt(i)-'a']++;
          freq[t.charAt(i)-'a']--;
          
            }for(int i:freq){
            if(i!=0){
            return false;
        
        }}
        return true;*/
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        char freq[]=new char[26];
        for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
        }
        for(char c:freq){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}