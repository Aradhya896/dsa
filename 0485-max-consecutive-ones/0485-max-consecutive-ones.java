class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        /*int max=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                c++;
            else{
            c=0;
        
            }
            max=Math.max(c,max);
    }  
    return max;*/
    int max=0;
    int c=0;
    for(int i=0;i<arr.length;i++){
        
      if(arr[i]==1){
        c++;
        max=Math.max(max,c);
      }
      if(arr[i]==0){
        c=0;
      }
    }
    return max;
    }
}