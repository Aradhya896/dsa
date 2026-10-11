class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
   boolean res=false;

    int arr1[]=new int[26];
    int arr2[]=new int[26];
    for(int i=0;i<magazine.length();i++){
        char ch1=magazine.charAt(i);
        arr1[ch1-'a']++;
    }
    for(int i=0;i<ransomNote.length();i++){
        char ch1=ransomNote.charAt(i);
        arr2[ch1-'a']++;
    }
    for(int i=0;i<26;i++){
        if(arr1[i]<arr2[i]){
            return false;
        }

    }
    return true;
    }}