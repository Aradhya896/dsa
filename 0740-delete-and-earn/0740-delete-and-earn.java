class Solution {
    /*public int func(int i,int max,HashMap<Integer,Integer>map){
    if(i>map.size()){
        return 0;
    }
    if (map.get(i + 1) < map.size() && i + 1 != map.get(i + 1)) {
      return map.containsKey(i);
    }
   int c1= func(i+1,sum+(i*map.get(i)),map);
   int c2= func(i+1,sum,map);
   
   return c1+c2;
   
    }
    public int deleteAndEarn(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
       // Set<Integer>set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        max=Math.max(max,nums[i]);
        }
        return func(1,0,map);
    }*/
    int dp[];
    //public long maximumTotalDamage(int[] power) {
    public int deleteAndEarn(int[] nums) {
        
       
        Arrays.sort(nums);
       int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,nums[i]);
            dp=new int[max+2];
             Arrays.fill(dp,-1);
         }
       // Set<Integer>s=new set<>();
return func(1,map,max);

    }
    
    public int func(int i,HashMap<Integer,Integer>map,long max){
    if(i>max){
        return 0;
    }
    if(dp[i]!=-1){
        return dp[i];
    }
    int c1=i*map.getOrDefault(i, 0)+func(i+2,map,max);
   // long c2=i*map.getOrDefault(i, 0)+func(i+2,map,max);
    int c3=func(i+1,map,max);

   // max= Math.max(c1,c2);
    dp[i]= Math.max(c1,c3);
    return dp[i];
    }
}
