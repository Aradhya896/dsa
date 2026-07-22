class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,Comparator.comparingInt(o->o[1]));
        int c=0;
        int lastEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastEnd){
                c++;
            }else{

                lastEnd=intervals[i][1];
            }
        }
        return c;
    }
}
    