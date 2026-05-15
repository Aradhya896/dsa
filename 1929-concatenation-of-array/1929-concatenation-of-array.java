class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        int n=nums.length;
        int c=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            c=i+1;
        }
        for(int i=0;i<n;i++){
            arr[c]=nums[i];
            c++;
        }
        return arr;
    }
}