class Solution {
    public int arrayPairSum(int[] nums) {
        /*int a[]=new int[n];
        int n=nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<2*n;i++){
            while(arr[i]>0){
           a[i]=i;
           arr[i]--;
        }}
*/
Arrays.sort(nums);
int sum=0;
for(int i=0;i<nums.length;i+=2){
sum+=Math.min(nums[i],nums[i+1]);
}
return sum;
    }
}