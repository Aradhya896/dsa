class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>kidsWithCandies=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                kidsWithCandies.add(true);
            }
            else{
                 kidsWithCandies.add(false);
            }
        }
        return kidsWithCandies;
    }
}