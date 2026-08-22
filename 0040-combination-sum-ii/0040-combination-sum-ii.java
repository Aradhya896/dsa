class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        findCombinations(0,candidates,target,ans,ds);
       // Collections.sort(ans);
         return ans; 
    }
    public void findCombinations(int idx,int arr[],int target,List<List<Integer>>ans,List<Integer>ds){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));

            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findCombinations(idx+1,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
         int next = idx + 1;

while (next < arr.length && arr[next] == arr[idx]) {
    next++;
    }    findCombinations(next,arr,target,ans,ds);

       
}
    }

