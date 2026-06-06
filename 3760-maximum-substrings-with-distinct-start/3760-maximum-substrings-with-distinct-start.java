class Solution {
    public int maxDistinct(String s) {
        Set<Character>set=new HashSet<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
}