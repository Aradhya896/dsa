class Solution {
    public void moveZeroes(int[] arr) {
      /*  int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != last) {
                    int tmp = nums[i];
                    nums[i] = nums[last];
                    nums[last] = tmp;
                }
                last++;
            }
        }
    }
}

class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        
        int temp[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[c]=arr[i];
            
             c++;
             }}
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }}}
        class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
         int j=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]!=0){
               arr[j]=nums[i];
                 j++;
            }
          
        }
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }*/
        int a[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            a[j]=arr[i];
            j++;
        }
        }
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        
        }
            }}
        