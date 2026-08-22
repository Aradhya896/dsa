class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>al=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        findCombinations(0,target,candidates,al,ds);
        return al;
    }
    public void findCombinations(int idx,int target,int arr[],List<List<Integer>>al,List<Integer>ds){
        if(idx==arr.length){
            if(target==0){
                al.add(new ArrayList<>(ds));
            }
            return;

        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findCombinations(idx,target-arr[idx],arr,al,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(idx+1,target,arr,al,ds);
    }
}