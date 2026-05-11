import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ll=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom= m-1;
        int left = 0;
        int right = n-1;
          while(top<=bottom && left<=right){
          for(int i=left;i<=right;i++){
            ll.add(matrix[top][i]);
          }top++;
for(int i=top;i<=bottom;i++){
            ll.add(matrix[i][right]);
          }right--;
if(top<=bottom){
          for(int i=right;i>=left;i--){
            ll.add(matrix[bottom][i]);
          }bottom--;
          }
           if(left<=right){
           for(int i=bottom;i>=top;i--){
            ll.add(matrix[i][left]);
          }left++;
          }}
          return ll;
    }
}