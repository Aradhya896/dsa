class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int total=1<<n;
        List<List<Integer>>ll=new ArrayList<>();
        for(int i=0;i<total;i++){
            List<Integer>ll1=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))!=0){
                    ll1.add(nums[j]);
                }
            }
            ll.add(ll1);
        }
        return ll;
            }
}