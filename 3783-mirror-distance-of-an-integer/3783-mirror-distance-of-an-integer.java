class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int rev=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return Math.abs(rev-n);
    }
}