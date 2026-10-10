class Solution {
    public int[] twoSum(int[] arr, int k) {
        int a[]=new int[2];
      int i=0;
      int j=arr.length-1;
      while(i<j){
      if(arr[i]+arr[j]==k){
        a[0]=i+1;
        a[1]=j+1;
        i++;
        j--;
      }else if(arr[i] + arr[j] < k){
      i++;
      
      }else{
        j--;
      }}
      return a;
    }
}