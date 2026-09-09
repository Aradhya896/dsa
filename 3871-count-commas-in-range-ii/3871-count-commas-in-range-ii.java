class Solution {
    public long countCommas(long n) {
        long num=n;
        long c=0;
        long start=1000;
        long commas=1;
        while(start<=num){
            long end=start*1000-1;
            long count=Math.min(num,end)-start+1;
            if(count>0){
                c+=count*commas;
            } start*=1000;
                commas++;
            
       
        }
        return c;
    }
}