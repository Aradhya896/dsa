class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int total=1<<n;
        Set<List<Integer>>set=new HashSet<>();
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<total;i++){
            List<Integer>al2=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i &(1<<j))!=0){
                    al2.add(nums[j]);
                }
            }
            set.add(al2);
        }
       al.addAll(set);
        return al;
    }
}