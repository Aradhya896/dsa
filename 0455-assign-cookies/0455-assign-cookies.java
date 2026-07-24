class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int i=0;
        int n=g.length;
        int m=s.length;
        //int min=Math.min(n,m);
        for(int j=0;j<m;j++){
            if(i==n){
                break;
            }
            if(s[j]>=g[i]){
               c++;
               i++;
            }
        }
        return c;
    }
}