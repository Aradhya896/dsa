class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=arr.length;
        int k=n/2;
        int ans=0;
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);

        }for(int i=0;i<n;i++){
           if(mp.get(arr[i])>k){
            ans=arr[i];
           }
        }
        return ans;
    }
}