class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int sum=0;
        int c=0;
        mpp.put(0,1);
        for(int i:nums){
            sum+=i;
         if(mpp.containsKey((sum%k+k)%k)){
            c+=mpp.get((sum%k+k)%k);
         }
         mpp.put((sum%k+k)%k,mpp.getOrDefault((sum%k+k)%k,0)+1);
        }
        return c;
    }
}