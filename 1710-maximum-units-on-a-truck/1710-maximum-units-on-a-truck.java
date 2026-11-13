class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1], a[1]));
         int c=0;
         int sum=0;
         for(int i=0;i<boxTypes.length;i++){
            if(c<truckSize){
                int take=Math.min(boxTypes[i][0], truckSize - c);
                c+=take;
                sum+=(take* boxTypes[i][1]);
            }
         }   
         return sum; 
    }
}