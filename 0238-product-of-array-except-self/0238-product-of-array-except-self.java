class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.fill(arr,1);
    
         int left=1;
         int right=1;
        for(int i=0;i<nums.length;i++){
           arr[i]=left;
         left  =nums[i]*left;
        
            }
            for(int i=nums.length-1;i>=0;i--){
                
           arr[i]*=right;
           right=nums[i]*right;
            }
           
    
        return arr;
    }
}