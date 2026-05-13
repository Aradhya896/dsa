class Solution {
    public int xorOperation(int n, int start) {
        int c=0;
        for(int i=start;i<start+2*n;i=i+2){
          c^=i;
        }
        return c;
    }
}