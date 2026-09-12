class Solution {
    public int countSpecialIntegers(int[] nums) {
        int c=0;
        ArrayList<Integer>[] al=new ArrayList[101];
        for(int i=0;i<=100;i++){
            al[i]=new ArrayList<>();
        }
        for(int i=0;i<nums.length;i++){
            al[nums[i]].add(i);
        }
        for(int i=0;i<=100;i++){
            if(al[i].size()==3){
                int i1=al[i].get(0);
                int i2=al[i].get(1);
                int i3=al[i].get(2);
                if((i2-i1)==(i3-i2)){
                 c++;
                }
            }
        }
        return c;

         
    }
}