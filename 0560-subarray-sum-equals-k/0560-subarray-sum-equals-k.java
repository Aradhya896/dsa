class Solution {
    public int subarraySum(int[] nums, int k) {
         HashMap<Integer,Integer> mpp=new HashMap<>();
   int prefixsum=0;
   int c=0;
   mpp.put(0,1);
   for(int i:nums){
     prefixsum+=i;
 if(mpp.containsKey(prefixsum-k)){
    c+=mpp.get(prefixsum-k);
 }
 mpp.put(prefixsum,mpp.getOrDefault(prefixsum,0)+1);

   
        }
        return c;
    }
}