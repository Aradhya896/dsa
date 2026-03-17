class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
     
        int arr[]=new int[n];
          arr[0]=gain[0];
           int max=0;
         

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+gain[i];
            //max=Math.max(max,arr[i]);
           // max=Math.max(max,arr[i]);
        }  for(int i = 0; i < n; i++){
            max=Math.max(max,arr[i]);
           }
      //  System.out.println(arr);
        return max;
    }
}