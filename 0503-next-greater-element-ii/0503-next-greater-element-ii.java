class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
         ans[i]=-1;
        }
        Stack<Integer>st=new Stack<>();
        
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
     while(!st.isEmpty() && st.peek()<=curr){
st.pop();
     }
     if(i<n && !st.isEmpty()){
ans[i]=st.peek();
     }
     st.push(curr);
        }
        return ans;
    }
}