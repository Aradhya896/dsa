class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int c=0;
        int sum=0;
        int avg=0;
        for(int i=0;i<k;i++){
          sum+=arr[i];
          
        }
        avg = sum / k;
        if(avg >= threshold) c++;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
             avg=sum/k;
             if(avg>=threshold){
            c++;
        }
          
        } 
        return c;
    }
}