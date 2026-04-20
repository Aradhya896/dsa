class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
          int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          
            for(int j=i;j<n;j++){
                if(colors[i]!=colors[j]){
                  max=((int)Math.max(max,Math.abs(j-i)));
                }
            }
        }
        return max;
    }
}