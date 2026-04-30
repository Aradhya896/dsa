/*class Solution {
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            c0++;
          } else if(nums[i]==1){
            c1++;
            }else{
            c2++;
        }}
        int index=0;
        while(c0>0){
            nums[index++]=0;
            c0--;
        }
         while(c1>0){
            nums[index++]=1;
            c1--;
        }
         while(c2>0){
            nums[index++]=2;
            c2--;
        }
    }
} 
class Solution{
    public void sortColors(int[] nums) {
       int n= nums.length;
        int[] arr=new int[n];
        int indx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[indx++]=0;
            }
        }for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                arr[indx++]=1;
            }}
            for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
                arr[indx++]=2;
            }}
            for(int i=0;i<n;i++){
            nums[i]=arr[i];
            }
}} */
class Solution{
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
      while(m<=h){
        if(nums[m]==0){
            int temp=nums[m];
            nums[m]=nums[l];
            nums[l]=temp;
            l++;
            m++;
        }else if(nums[m]==2){
            int temp=nums[m];
            nums[m]=nums[h];
            nums[h]=temp;
            h--;
            //m++;
        }
        else{
            m++;
        }
      }}
}