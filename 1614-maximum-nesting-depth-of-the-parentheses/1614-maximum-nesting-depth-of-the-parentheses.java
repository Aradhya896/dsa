class Solution {
    public int maxDepth(String s) {
        int c=0;
        int ans=0;
        for(int i:s.toCharArray()){
            if(i=='('){
                c++;
            }if(i==')'){
                c--;
            }
            ans=Math.max(ans,c);
        
        }
        return ans;
    }
}